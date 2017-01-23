package corejava.hashcode;

public class LearnHashCode {
	
	public static void main(String[] args) {
		Bicycle bicycle1 = new Bicycle();
		Bicycle bicycle2 = bicycle1;
		
		System.out.println(bicycle1.hashCode());
		System.out.println(bicycle2.hashCode());
	}
}
