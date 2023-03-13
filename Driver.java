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
        /*
                try {
        PrintStream testoutput = new PrintStream("DemoTestOutput.txt");
        System.setOut(testoutput);

        } catch (FileNotFoundException e) {
            System.err.println("File was not found");
            System.exit(1);
        }
         */

        //change below
        
    	Network objNetwork = new Network( );            /* Activate the network */
        objNetwork.start();

        Client objClient12 = new Client("sending");          /* Start the sending client thread */
        objClient12.start();
        Client objClient22 = new Client("receiving");        /* Start the receiving client thread */
        objClient22.start();

    }
    
 }
