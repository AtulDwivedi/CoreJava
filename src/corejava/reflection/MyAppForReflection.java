package corejava.reflection;

public class MyAppForReflection {

	private int val;

	public void method1(){
		System.out.println("No parametere maetho1");
	}
	
	public void method2(int i){
		System.out.println("Single int argumented method2");
	}
	
	public void method3(String str){
		System.out.println("Single atring argumented method3");
	}
	
	public void setVal(int val){
		this.val=val;
	}
	
	public int getVak(){
		return val;
	}
}
