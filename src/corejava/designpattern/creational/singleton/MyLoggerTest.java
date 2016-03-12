package corejava.designpattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class MyLoggerTest {

	
	public static void main(String[] args) {
		MyLogger myLogger1 = MyLogger.getMyLogger();
		MyLogger myLogger2 = MyLogger.getMyLogger();
		MyLogger myLogger3 = MyLogger.getMyLogger();
		MyLogger myLogger4 = MyLogger.getMyLogger();
		MyLogger myLogger5 = MyLogger.getMyLogger();
		
		myLogger1.info("Leaning Singlton design pattern...");
		
		List<MyLogger> myLoggerList = new ArrayList<MyLogger>();
		myLoggerList.add(myLogger1);
		myLoggerList.add(myLogger2);
		myLoggerList.add(myLogger3);
		myLoggerList.add(myLogger4);
		myLoggerList.add(myLogger5);
		
		for (MyLogger myLogger : myLoggerList) {
			System.out.println(myLogger1.areWeSame(myLogger));	
		}
	}
}
