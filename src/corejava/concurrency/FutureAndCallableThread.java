package corejava.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureAndCallableThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(3);
		Future<Integer> addResult = es.submit(new C1(2,5));
		Future<Integer> multResult = es.submit(new C2(2,3));
		
		try {
			System.out.println("Fianl Result: "+(addResult.get() + multResult.get()));
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdown();
	}

}

class C1 implements Callable<Integer>{
	private int x,y;
	public C1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return x+y;
	}
	
}


class C2 implements Callable<Integer>{
	private int x,y;
	public C2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return x*y;
	}
	
}
