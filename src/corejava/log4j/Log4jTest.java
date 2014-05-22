package corejava.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4jTest {
 
	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(Log4jTest.class);
			
		
		//ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
		logger.setLevel(Level.INFO);
		
		logger.trace("Trace message!");
		logger.debug("Debug message!");
		logger.info("Info message!");
		logger.warn("Warning message!");
		logger.error("Error message!");
		logger.fatal("Fatal message!");
		/*
		try {
			logger.info("Getting input arguments...");
			String s = args[0];
			logger.info("Got arguments...");
			int i = Integer.parseInt(s);
			logger.info("Casted to integer.");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			logger.error("Number Format Exception: ",e);
		}catch(ArrayIndexOutOfBoundsException aie)
		{
			logger.error("Array Index Out Of Bounds Exception: ",aie);
			
		}*/
	}
	

}
