import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONReader {

    public static String getAbstract(String urlToApi) throws IOException {
        URL url = new URL(urlToApi);

        URLConnection connection = url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String i = br.readLine();
        JSONObject js = new JSONObject(i);
        JSONArray ar = (JSONArray) js.get("result");
        JSONObject res = (JSONObject) ar.get(0);
        String abs = (String) res.get("abstract");
        return abs;
    }

    public static void main(String[] args) throws IOException {


        ArrayList<String> abstractsFromAPI = new ArrayList<String>(){{
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


        for (String s: abstractsFromAPI) {
            String query = s.replace(" ", "%20");

            String url = "https://api.aminer.org/api/search/pub?query=" + query;
            System.out.println(url);
            System.out.println(getAbstract(url));
        }

    }
}
