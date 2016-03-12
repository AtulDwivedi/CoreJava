package corejava.io;

import java.io.File;

public class LearnFile {

	static String abstractPathname = null;
	static File file = null;
	public static void main(String[] args){
//		abstractPathname = "MyTextFile.txt";
		abstractPathname = "C:";
		file = new File(abstractPathname);
//		file.createNewFile();
		if(file.exists()){
			System.out.println("File or Directory exists.");
			if(file.isFile()){
				System.out.println("This is file.");
				if(file.canRead()){
					System.out.println("File is readable.");
				}
				if(file.canWrite()){
					System.out.println("File is writable.");
				}
			}
			else if(file.isDirectory()){
				System.out.println("This is directory.");
				if(file.canRead()){
					System.out.println("Directory is readable.");
				}
				if(file.canWrite()){
					System.out.println("Directory is writable.");
				}
			}
		}
		else{
			System.out.println("No such File or Directory exists.");
		}
	}

}
