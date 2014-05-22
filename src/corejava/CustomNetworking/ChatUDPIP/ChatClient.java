package corejava.CustomNetworking.ChatUDPIP;

import java.net.*;
import java.io.*;
public class ChatClient {
	public static void main(String args[])throws Exception {
		
		MulticastSocket chat = new MulticastSocket(1234);
		InetAddress group = InetAddress.getByName("234.5.6.7");
		chat.joinGroup(group);
		String msg = "";
		System.out.println("Type a message for the server:");


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		msg = br.readLine();
		DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, 1234);
		chat.send(data);


		chat.close();
		
	}
}
