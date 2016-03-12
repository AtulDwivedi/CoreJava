package corejava.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIt {

	public static void main(String args[]){
		//Valid
		String[] dictionary = {"HI", "YOU", "SAY"};
		String message = "HIYOUSAYHI";
		System.out.println(decode(dictionary, message));

		//Invalid
		String[] dictionary2 = {"HI", "YOU"};
		String message2 = "BYEALL";
		System.out.println(decode(dictionary2, message2));

		//Ambiguous
		String[] dictionary3 = {"ABC","AB","CB","ABCB"};
		String message3 = "ABCBA";
		System.out.println(decode(dictionary3, message3));
	}

	public static String decode(String[] dictionary, String message) {
		int count = 0;
		int index=0;
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < dictionary.length; i++){
			Pattern p = Pattern.compile(dictionary[i]);
			Matcher m = p.matcher( message );
			count = 0;
			while (m.find()) {
				count++;
			}
			if(count != 1)
				break;
		}
		if(count==0){
			result.append("INVALID");
		}
		else if(count>1){
			result.append("AMBIGUISH");
		}else{
			for (int i = 0; i < message.length(); i++) {
				if (i != message.length() -1 && message.substring(i).contains(dictionary[index])){
					result.append(dictionary[index]);
					result.append(" ");
					i = i + message.indexOf(dictionary[index].charAt(dictionary[index].length()-1));
					index++;
				}
			}
		}
		return result.toString();
	}
}
