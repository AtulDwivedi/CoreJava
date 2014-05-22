package corejava.concurrency;

public class SubclassThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new SubclassThread()).start();
		System.out.println("Hello from: "+Thread.currentThread().getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from: "+Thread.currentThread().getName());
	}

}
