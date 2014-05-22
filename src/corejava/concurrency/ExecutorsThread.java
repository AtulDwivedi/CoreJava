package corejava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);
		es.submit(new R1());
		es.submit(new R2());
		es.shutdown();

	}

}

class R1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from: "+Thread.currentThread().getName());
	}
	
}

class R2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from: "+Thread.currentThread().getName());
	}
	
}
