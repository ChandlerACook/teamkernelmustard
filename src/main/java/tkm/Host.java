/*
 * Host.class
 * version 1.0
 * Guenevere Logan
 * October 18, 2024
 * 
 * Purpose: This class will be utilized to establish a server
 *  and one user as the host of a game session.
 * 
 * Relevant Resources:
 *  GeeksForGeeks - basic utilization of sockets to establish server, code foundation
 *  https://www.geeksforgeeks.org/socket-programming-in-java/ 
 * 
 *  Oracle - defining sockets 
 *  https://docs.oracle.com/javase/tutorial//networking/sockets/
 *      Socket: "one end-point of a two-way communication link between two programs 
 *              running on the network."
 *              used to show connection b/w client and server
 *              java.net package provides classes Socket (client-side) and ServerSocket (server-side)
 *              TCP used to communicate
 *  
 *
 */
package tkm;

 import java.net.*;
import java.io.*;

public class Host {
    //initialize
    private Socket socket = null; 
    private ServerSocket host = null;
    private DataInputStream in = null;  //deprecated

    //constructor
    public Host(int port) {
        
        //start server, attempt connection
        try {
            //new server
            host = new ServerSocket(port);
            System.out.println("Server Started");
            System.out.println("Waiting for players to join...");

            //connect client
            socket = host.accept();
            System.out.println("Player Joined");

            //accept data input from client
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";

            //read client message until "Over" sent
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                }

                catch(IOException i) {
                    System.out.println(i);
                }
            }
             //close connection
             //not currently printing 
            System.out.println("Player Disconnected");
            socket.close();
            in.close();
        }

        catch(IOException i) {
            System.out.println(i);
        }

       
    }


    public static void main(String args[]) {
        Host host = new Host(5000);
    }

}
