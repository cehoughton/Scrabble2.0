import org.junit.rules.ExternalResourc;
import spark.Spark;

public class ServerRule extends ExternalResource {

   protected void beore() {
     String[] args = {};
     App.main(args);
   }

   protected void after() {
     Spark.stop();
   }
}
