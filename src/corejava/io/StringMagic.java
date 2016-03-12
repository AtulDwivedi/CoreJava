package corejava.io;

public class StringMagic {
	static String ip= "Manhattan_Associates";
	public static void main(String[] args) {
		System.out.println("Input: "+ip);
		int index = ip.indexOf("_");
		String op = ip.substring(0, index-1)+"\n"+ip.substring(index+1, ip.length()-1);
		System.out.println("Output: "+op);
	}
}
