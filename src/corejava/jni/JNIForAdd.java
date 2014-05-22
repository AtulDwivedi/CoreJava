package corejava.jni;

public class JNIForAdd {
	public native int add(int x, int y);
	
	public static void main(String[] args) {
		
		System.loadLibrary("StatLib");
		JNIForAdd temp =new JNIForAdd();
		int result = temp.add(2, 3);
		System.out.println("Result is " + result);
		
	}

}
