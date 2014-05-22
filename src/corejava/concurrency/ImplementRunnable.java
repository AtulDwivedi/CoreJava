package corejava.concurrency;

public class ImplementRunnable implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Thread(new ImplementRunnable(), "Runnable_Object_Thread")).start();	
		System.out.println("Hello from: "+Thread.currentThread().getName());
	}
	
	public void run(){
		System.out.println("Hello from: "+Thread.currentThread().getName());
	}
	
}
