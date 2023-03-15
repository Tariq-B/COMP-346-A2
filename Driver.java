import java.io.*;

/**
 * @author Tariq Benmouh
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //print for later

                try {
        PrintStream testoutput = new PrintStream("Phase1TestOutput3.txt");
        System.setOut(testoutput);

        } catch (FileNotFoundException e) {
            System.err.println("File was not found");
            System.exit(1);
        }


        //change below

        Network objNetwork = new Network( );             /* Activate the network */
        objNetwork.start();

        Client client1 = new Client("sending");                /* Activate the sending client */
        client1.start();
        Client client2 = new Client("receiving");              /* Activate the receiving client */
        client2.start();

        Server objServer1 = new Server("Thread 1");                       /* Activate the first server thread*/
        objServer1.start();
        Server objServer2 = new Server("Thread 2");                       /* Activate the 2nd server thread */
        objServer2.start();



        // to not be zombie threads (might not be needed)
        /*try {
        objServer.join();
        client1.join();
        client2.join();
        objNetwork.join();}
        catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

    }
    
 }
