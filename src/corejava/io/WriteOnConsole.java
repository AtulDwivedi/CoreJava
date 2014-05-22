package corejava.io;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriteOnConsole {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStreamWriter osr = new OutputStreamWriter(System.out);
			PrintWriter pr = new PrintWriter(osr);
			pr.println("Hello");
			pr.close();
			osr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
