package corejava.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToTextFile {

	/**
	 * @param args
	 */
	
	static FileWriter fw = null;
	static PrintWriter pw = null;
	
	public static void main(String[] args) {
		try {
			 fw=new FileWriter("MyTextFile.txt");
			 pw =new PrintWriter(fw);
			pw.println("ok this is fine");
			System.out.println("great");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pw != null){
				pw.close();
			}
		}
		
		

	}

}
