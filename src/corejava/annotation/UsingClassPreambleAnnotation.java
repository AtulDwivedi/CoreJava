package corejava.annotation;

@ClassPreamble(
		author = "Atul Dwivedi", 
		date = "04-09-2016", 
		version = 1.1f,
		lastModified = "Atul",
		by = "Atul D", 
		reviewers = { "Martin", "Fowler" })
public class UsingClassPreambleAnnotation {

	public String name = "Sakti";
	
	public void myMethod1(){
		System.out.println("a dkja");
	}
	
	private int myMethod2(){
		return 0;
	}
	
	protected String myMethod3(){
		return "";
	}
}
