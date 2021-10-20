import java.sql.*;
import java.util.HashMap;
import java.util.List;

public class DatabaseSubmission {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html#package.description
        // auto java.sql.Driver discovery -- no longer need to load a java.sql.Driver class via Class.forName

        // register JDBC driver, optional since java 1.6

        // auto close connection
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/CS7340_test", "root", "Chas3755")) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            DomParser DP = new DomParser();
            DP.authorId = 1;
            DP.did = 1;
            DP.authors = new HashMap<String,Integer>();

            List<PaperAbstract> paperAbstracts = DP.getPaperAbstracts();


            Statement state = conn.createStatement();
            for(PaperAbstract pa: paperAbstracts){
                String paSQL = "update CS7340_test.papers set abstract = '" + pa.abs + "' where title = '" + pa.title + "';";
                System.out.println(paSQL);
                state.execute(paSQL);

            }



        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
