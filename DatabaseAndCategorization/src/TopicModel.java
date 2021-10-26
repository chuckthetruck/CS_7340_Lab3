
import cc.mallet.util.*;
import cc.mallet.types.*;
import cc.mallet.pipe.*;
import cc.mallet.pipe.iterator.*;
import cc.mallet.topics.*;

import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.regex.*;
import java.io.*;

public class TopicModel {

    public static void main(String[] args){


        try {

            //Get the Connection from the Lazy intantiator
            Connection conn = LazyConnection.getConnInstance();

            //Get all abstracts that aren't null and add them to a list to be categorized
            List<String> abs = new ArrayList<String>();
            Statement state = conn.createStatement();
            String absQuery = "select abstract from CS7340_test.papers where abstract is not NULL";
            ResultSet rs = state.executeQuery(absQuery);

            while(rs.next()){
                abs.add(rs.getString("abstract"));
            }


            // Begin by importing documents from text to feature sequences
            ArrayList<Pipe> pipeList = new ArrayList<Pipe>();

            // Pipes: lowercase, tokenize, remove stopwords, map to features
            pipeList.add( new CharSequenceLowercase() );
            pipeList.add( new CharSequence2TokenSequence(Pattern.compile("\\p{L}[\\p{L}\\p{P}]+\\p{L}")) );
            pipeList.add( new TokenSequenceRemoveStopwords(new File("src/en.txt"), "UTF-8", false, false, false) );
            pipeList.add( new TokenSequence2FeatureSequence() );

            InstanceList instances = new InstanceList (new SerialPipes(pipeList));

            //Reader fileReader = new InputStreamReader(new FileInputStream(new File("sample-data/web/en/ap.txt")), "UTF-8");
            instances.addThruPipe(new ArrayIterator (abs)); // data, label, name fields

            // Create a model with 100 topics, alpha_t = 0.01, beta_w = 0.01
            //  Note that the first parameter is passed as the sum over topics, while
            //  the second is
            int numTopics = 10;
            ParallelTopicModel model = new ParallelTopicModel(numTopics, 1.0, 0.01);

            model.addInstances(instances);

            // Use two parallel samplers, which each look at one half the corpus and combine
            //  statistics after every iteration.
            model.setNumThreads(2);

            // Run the model for 50 iterations and stop (this is for testing only,
            //  for real applications, use 1000 to 2000 iterations)
            model.setNumIterations(500);
            model.estimate();

            // Show the words and topics in the first instance

            // The data alphabet maps word IDs to strings
            Alphabet dataAlphabet = instances.getDataAlphabet();

            FeatureSequence tokens = (FeatureSequence) model.getData().get(0).instance.getData();
            LabelSequence topics = model.getData().get(0).topicSequence;

            Formatter out = new Formatter(new StringBuilder(), Locale.US);
            for (int position = 0; position < tokens.getLength(); position++) {
                out.format("%s-%d ", dataAlphabet.lookupObject(tokens.getIndexAtPosition(position)), topics.getIndexAtPosition(position));
            }
            System.out.println(out);

            // Update the Topic column in the papers table to reflect those learned from the LDA Topic Model
            for (int i = 0; i < abs.size(); i++){
                String checkAbs = abs.get(i);
                String sqlTopic = "update papers set topic = " + getIndexOfMax(model.getTopicProbabilities(i)) + " where abstract = '" + checkAbs +"';";
                System.out.println(sqlTopic);
                state.execute(sqlTopic);

            }



        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }

    // A simple function to get the index of the max value of the probabilities array which reflects the predicted topic.
    public static int getIndexOfMax(double[] array){

        int largest = 0;
        for ( int i = 1; i < array.length; i++ )
        {
            if ( array[i] > array[largest] ) largest = i;
        }
        return largest;

    }

}