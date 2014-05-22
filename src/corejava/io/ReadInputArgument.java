package corejava.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInputArgument {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStreamReader fw = new InputStreamReader(System.in);
			BufferedReader pw =new BufferedReader(fw);
			
			if (pw.readLine() != null) {
				System.out.println(pw.readLine());
			} else {
				System.out.println("No argument is provided.");
			}
			
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
