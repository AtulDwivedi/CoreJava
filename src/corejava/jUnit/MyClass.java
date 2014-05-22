package corejava.jUnit;

public class MyClass {
	public static int mult(int x, int y){
		if (x == 0 || y == 0) {
			return 0;
		} else if (x < 0 || y < 0) {
			return -1;
		} else {
			return x*y;
		} 
	}
}
