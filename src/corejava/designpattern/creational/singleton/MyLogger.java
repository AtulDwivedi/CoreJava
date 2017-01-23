package corejava.designpattern.creational.singleton;


public class MyLogger {
	
	private static MyLogger myLogger;

	private MyLogger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized MyLogger getMyLogger(){
		if(myLogger == null)
			myLogger = new MyLogger();
		return myLogger;
	}

	public void info(String message){
		System.out.println(message);
	}
	
	/**
	 * 
	 * @param myLogger
	 * @return true if both references are pointing to the same instance
	 */
	public boolean areWeSame(MyLogger myLogger){
		boolean bothAreSame = false;
		
		if(this == myLogger)
			bothAreSame = true;
		
		return bothAreSame;
	}
}
