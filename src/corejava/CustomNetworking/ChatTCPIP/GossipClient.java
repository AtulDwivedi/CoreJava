package corejava.CustomNetworking.ChatTCPIP;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class GossipClient { 
	public static void main(String[] args) throws Exception { 
		
		Socket sock = new Socket("127.0.0.1", 3000); 
		
		// reading from keyboard (keyRead object) 
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
		
		// sending to Server (pwrite object) 
		OutputStream ostream = sock.getOutputStream(); 
		PrintWriter pwrite = new PrintWriter(ostream, true);   
		
		// receiving from server ( receiveRead object) 
		InputStream istream = sock.getInputStream(); 
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
		
		System.out.println("Start the chitchat, type and press Enter key");
		
		String receiveMessage, sendMessage; 
		
		while(true) { 
			sendMessage = keyRead.readLine(); // keyboard reading 
			pwrite.println(sendMessage); // sending to server 
			System.out.flush(); // flush the data 
			
			if((receiveMessage = receiveRead.readLine()) != null) //receive from server 
			{ 
				System.out.println("Server>> "+receiveMessage); // displaying at DOS prompt 
			}
		} 
	} 
				
}


