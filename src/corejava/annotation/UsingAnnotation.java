package corejava.annotation;


public class UsingAnnotation {
	
	@MyAnnotation(level=1)
	public static void fun(){
		System.out.println("Using annotation named MyAnnotation.");
	}
}
