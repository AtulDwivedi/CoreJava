package corejava.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToBinaryFile {
	
	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream os = null;
		try {
			fos = new FileOutputStream("MyBinaryFile.g");
			os =new ObjectOutputStream(fos);
			
/*			
			DataOutputStream dos =new DataOutputStream(fos);
			dos.write(10);
			dos.writeDouble(10.00);
			dos.close();
*/			
			 
			Circle c =new Circle(5);
			os.writeInt(20);
			os.writeDouble(20.00);
			os.writeObject(c);
			
			os.close();
			
			System.out.println("File write completed.");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		finally{
				try {
					if(fos != null)
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
	}

}
