package corejava.CustomNetworking.streamsocket;

// Fig. 27.6: ServerTest.java
// Test the Server application.
import javax.swing.JFrame;

public class ServerTest
{
   public static void main( String[] args )
   {
      Server application = new Server(); // create server
      //application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.runServer(); // run server application
   } // end main
} // end class ServerTest

