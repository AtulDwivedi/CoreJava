package corejava.CustomNetworking.temp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket sSock = new ServerSocket(3000);
		System.out.println("Server is waiting for client...");
		
		Socket sock = sSock.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		OutputStream os = sock.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true);
		
		InputStream is = sock.getInputStream();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(is));
		
		String sendMsg, rcvMsg;
		
		while(true){
			
			if((rcvMsg=br2.readLine()) != null)
			{
				System.out.println("Client>> "+rcvMsg);
			}
			
			sendMsg=br.readLine();
			pw.println(sendMsg);
			System.out.flush();
		}
	}

}
