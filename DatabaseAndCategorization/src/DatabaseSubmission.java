import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DatabaseSubmission {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
        // auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName

        // register JDBC driver, optional since java 1.6

        // auto close connection
        try {
            Connection conn = LazyConnection.getConnInstance();

            // Create a Document Parser and parse out PaperAbstract Objects which contain the title, ee, and abstract
            DomParser DP = new DomParser();
            List<PaperAbstract> paperAbstracts = DP.getPaperAbstracts();

            //Create a list of titles that we will use for the graduate portion of the lab
            //This is a selection of 10 papers but could be logically extended to all papers that are on the
            // aminer.org api
            ArrayList<String> titlesForAPI = new ArrayList<String>() {{
                add("QoS-Driven Service Composition with Reconfigurable Services.");
                add("Cloud Computing Service: The Caseof Large Matrix Determinant Computation.");
                add("A Workflow Management System for Scalable Data Mining on Clouds.");
                add("Distributed Management of Concurrent Web Service Transactions.");
                add("Cloud-Assisted Key Distribution in Batch for Secure Real-Time Mobile Services.");
                add("Artificial Societies, Computational Experiments, and Parallel Systems: An Investigation on a Computational Theory for Complex Socioeconomic Systems.");
                add("Hierarchical Online Problem Classification for IT Support Services.");
                add("Adaptable Context-Aware Cooking-Safe System.");
                add("On the Verification of Opacity in Web Services and Their Composition.");
                add("Collaborative Web Service QoS Prediction via Neighborhood Integrated Matrix Factorization.");
                add("From Web Service Artifact to a Readable and Verifiable Model.");
            }};

            Statement state = conn.createStatement();

            for (String title : titlesForAPI) {

                //Use the JSONReader Class to parse the response from the API query to grab the Abstract of a paper
                String query = title.replace(" ", "%20");
                String url = "https://api.aminer.org/api/search/pub?query=" + query;
                String abs = JSONReader.getAbstract(url);

                //Update the existing papers table in the database to have the new abstract from the API
                String apiSQL = "update CS7340_test.papers set abstract = '" + abs + "' where title = '" + title + "';";
                System.out.println(apiSQL);
                state.execute(apiSQL);
            }


            //For the papers from the XML, exclude those from the above example and upate the papers table to include
            //the abstracts.
            for (PaperAbstract pa : paperAbstracts) {
                if (!titlesForAPI.contains(pa.title)) {
                    String paSQL = "update CS7340_test.papers set abstract = '" + pa.abs + "' where title = '" + pa.title + "';";
                    System.out.println(paSQL);
                    state.execute(paSQL);
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
