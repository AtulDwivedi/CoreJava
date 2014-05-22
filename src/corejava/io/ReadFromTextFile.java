package corejava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {

	/**
	 * @param args
	 */
	static FileReader fr=null;
	static BufferedReader br = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fr=new FileReader("MyTextFile2.txt");
			br =new BufferedReader(fr);
			String message = br.readLine();

			System.out.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("Nahi hai");
		}
		finally{
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
