package corejava.anonymousclass;

public class ImplementInterfaceUsingAnonymousClass {

	// Interface to be implemented by anonymous class
	interface Greet {
		public void greetSomeone(String someone);
	}

	/*
	 * This is Anonymous Class declaration and instantiate
	 * greetJava is instance of anonymous class implementing Greet
	 */
	static Greet greetJava = new Greet() {
		String name = "";
		
		public void greetSomeone(String someone) {
			name = someone;
			System.out.println("Hello " + name + "!");
		}
	};

	// Run this code snippet
	public static void main(String... args) {
		greetJava.greetSomeone("Java");
	}
}
