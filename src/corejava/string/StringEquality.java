package corejava.string;

public class StringEquality {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "str";
		String str2 = "str";
		
		if(str1.equals(str2)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		if (str1 == str2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String str3 = new String("str");
		String str4 = new String("str");
		
		if(str3.equals(str4)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		if (str3 == str4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String str5 = new String("str");
		String str6 = "str";
		
		if(str5.equals(str6)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		if (str5 == str6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if (new String("test").equals("test")) {
			System.out.println("new String("+"test"+").equals("+"test"+") says:"+"TRUE");
		} else {
			System.out.println("new String("+"test"+").equals("+"test"+") says:"+"FALSE");
		}
	}

}
