/**
 * @author Tariq Benmouh
 */
public class Driver2 {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	Network2 objNetwork = new Network2( );            /* Activate the network */
        objNetwork.start();

        Client2 objClient12 = new Client2("sending");          /* Start the sending client thread */
        objClient12.start();
        Client2 objClient22 = new Client2("receiving");        /* Start the receiving client thread */
        objClient22.start();
        
      /*..............................................................................................................................................................*/
       
    }
    
 }
