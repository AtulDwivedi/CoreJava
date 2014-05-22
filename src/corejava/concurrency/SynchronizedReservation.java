package corejava.concurrency;


public class SynchronizedReservation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		MakeQueue mq = new MakeQueue();
		mq.getCount();
		
		
		ReservationWindow rw =new ReservationWindow();
		new Customer(rw, "From Bangalore to Delhi.");
		new Customer(rw, "From Delhi to Bangalore.");
		new Customer(rw, "From Bangalore to New York.");
	}

}

class MakeQueue extends Thread{

	private boolean stop = false;
	private int count=0;
	
	public boolean customStop(){
		if(count < 3)
			return stop;
		else
			return stop=true;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public MakeQueue(){
		start();
	}

	@Override
	public void run() {
		System.out.println("Making Queue...");
		while(!customStop()){
			count++;
			System.out.println("Count is: "+count);
		}
	}
	
}




class ReservationWindow{
	public void doResevation(String FromAndTo){
		System.out.println("Journey : "+FromAndTo);
		System.out.println("Amount and Id Received.");
		processing();
		System.out.println("Reservation Confirmed.");
	}

	private void processing() {
		try {
			System.out.println("Processing...");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}

class Customer implements Runnable{

	private static int cust=0;
	private ReservationWindow rw;
	private String FromAndTo;
	
	private Thread t;
	
	
	public Customer(ReservationWindow rw, String fromAndTo) {
		super();
		this.rw = rw;
		FromAndTo = fromAndTo;
		t=new Thread(this);
		t.start();
	}



	@Override
	public void run() {
		synchronized(rw){
			cust++;
			System.out.println("Cutomer number : "+cust);
		rw.doResevation(FromAndTo);
		}
	}
	
}
