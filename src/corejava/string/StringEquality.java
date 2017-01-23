package corejava.string;

public class StringEquality {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strLiteral1 = "str";
		String strLiteral2 = "str";
		
		System.out.println("strLiteral1.equals(strLiteral2): "+strLiteral1.equals(strLiteral2));
		System.out.println("strLiteral1 == strLiteral2: "+(strLiteral1 == strLiteral2));
		
		String strObj1 = new String("str");
		String strObj2 = new String("str");
		
		System.out.println("strObj1.equals(strObj2): "+strObj1.equals(strObj2));
		System.out.println("strObj1 == strObj2: "+(strObj1 == strObj2));
		
		String strObj3 = new String("str");
		String strLiteral3 = "str";
		
		System.out.println("strObj3.equals(strLiteral3): "+strObj3.equals(strLiteral3));
		System.out.println("strObj3 == strLiteral3: "+(strObj3 == strLiteral3));
	}

}
