package corejava.CustomNetworking.temp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Socket sock = new Socket("127.0.0.1", 3000);
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		OutputStream os = sock.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true);
		
		InputStream is = sock.getInputStream();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(is));
		
		System.out.println("Start the chitchat, type and press Enter key"); 
		
		String sendMsg, rcvMsg;
		
		while(true){
			
			sendMsg = br.readLine();
			pw.println(sendMsg);
			System.out.flush();
			
			if ((rcvMsg = br2.readLine()) != null) {
				System.out.println("Server>> "+rcvMsg);
			}
		}
	}

}
