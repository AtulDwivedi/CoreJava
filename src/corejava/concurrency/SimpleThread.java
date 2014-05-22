package corejava.concurrency;

public class SimpleThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable(){
			public void run()
			{
				System.out.println("Hello from: "+Thread.currentThread().getName());
			}
		}, "My Thread").start();


		System.out.println("Hello from: "+Thread.currentThread().getName());

	}

}
