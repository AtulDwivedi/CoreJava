package corejava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromBinaryFile
{
	
	public static void main(String[] args) {
		
		FileInputStream fis=null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("MyBinaryFile.g");
			 ois =new ObjectInputStream(fis);
			
			int x = ois.readInt();
			double y = ois.readDouble();
			Circle obj = (Circle)ois.readObject();
			int radius=obj.getRadius();
			
			System.out.println("Integer: "+ x +" Double:"+y+" Radius: "+radius);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
			try {
				if( fis != null)
					fis.close(); // is this a good code.
				if(ois != null)
					ois.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // welcome to fate.
				
			}
			
		}
		
		
	}

}
