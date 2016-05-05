package cdtwitter;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
/**
 *
 * @author Miguel
 */
public class CDtwitter {
    public static void main(String[] args) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter mitwitter = tf.getInstance();
        
        Status miStatus = mitwitter.updateStatus("Este tweet lo ha escrito Jorge");
        System.out.println(miStatus.getText());
    }
}
