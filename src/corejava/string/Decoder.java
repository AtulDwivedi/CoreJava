package corejava.string;

import java.util.Arrays;

public class Decoder {
	
	public static void main(String[] args) {
		//Valid
		String[] dictionary = {"HI", "THAT", "YOU", "SAY"};
		String message = "HIYOUSAYHITHAT";
		System.out.println(decode(dictionary, message));
	}

	public static String decode(String[] dictionary, String msg){
		String subString = null;
		StringBuffer message = new StringBuffer(msg);
		StringBuilder result = new StringBuilder();
		int i=0;
		while(i <= message.length()-1){
			subString = message.substring(0, i+1);
			Arrays.sort(dictionary);
			if (Arrays.binarySearch(dictionary, subString) >=0){
				result.append(subString);
				message =message.replace(0, subString.length(), "");
				result.append(" ");
				i = 0;
			}
			else{
				i = i+1;
			}
		}
		return result.toString();
	}
	
}
