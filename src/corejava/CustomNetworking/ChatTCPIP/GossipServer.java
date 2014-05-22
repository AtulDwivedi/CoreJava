package corejava.CustomNetworking.ChatTCPIP;

import java.io.*; 
import java.net.*;

public class GossipServer { 
	public static void main(String[] args) throws Exception { 
		
		ServerSocket sersock = new ServerSocket(3000); 
		System.out.println("Server ready for chatting"); 
		
		Socket sock = sersock.accept( ); 
		
		// reading from keyboard (keyRead object) 
		BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
		
		// sending to client (pwrite object) 
		OutputStream ostream = sock.getOutputStream(); 
		PrintWriter pwrite = new PrintWriter(ostream, true);   
		
		// receiving from client ( receiveRead object) 
		InputStream istream = sock.getInputStream(); 
		BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
		
		
		
		String receiveMessage, sendMessage; 
		
		while(true) { 
			if((receiveMessage = receiveRead.readLine()) != null) 
			{ 
				System.out.println("Client>> "+receiveMessage); 
			} 
			sendMessage =keyRead.readLine(); 
			pwrite.println(sendMessage); 
			System.out.flush(); 
		} 
	}
}