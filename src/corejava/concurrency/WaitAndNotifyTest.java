package corejava.concurrency;

public class WaitAndNotifyTest {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizedExe ce = new CustomizedExe();
		doSomeJob(100);
		ce.custSuspend();
		doSomeJob(100);
		ce.custResum();
		doSomeJob(100);
		ce.custStop();
	}

	private static void doSomeJob(int x) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class CustomizedExe extends Thread {
	private boolean stop;
	private boolean suspend;
	
	public void custStop(){
		stop=true;
	}
	
	public void custSuspend(){
		 suspend=true;
	}
	
	public synchronized void custResum(){
		notify();
		suspend=false;
	}
	
	public CustomizedExe() {
		// TODO Auto-generated constructor stub
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(!stop){
			System.out.println("Value of i: "+i);
			if(suspend){
				synchronized (this) {
					System.out.println("This thread is going to be suspend...");
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			i++;
		}
	}
	
	
		
}
	
