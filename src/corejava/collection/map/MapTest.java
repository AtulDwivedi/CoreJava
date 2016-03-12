package corejava.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

public class MapTest {

	static LoopThruMap looThruMap = null;
	
	public static void main(String[] args) {

		Logger logger = Logger.getLogger(MapTest.class);
		logger.info("---- Map Starts ----");
		
		looThruMap = new LoopThruMap();

		Map<String, Integer> cart =new TreeMap<String, Integer>();

		cart.put("ant",3);
		cart.put("zebra",4);
		cart.put("book",2);

		//Get value by specifying key
		Integer value = cart.get("book");
		logger.info("Value: "+value+" for key: book");

		//Check whether key is exists or not
		boolean keyTest = cart.containsKey("book");
		if (keyTest) {
			logger.info("Key book is present.");
		} else {
			logger.info("Key book is not present.");
		}

		//Check whether value is exists or not
		boolean valueTest = cart.containsValue(2);
		if (valueTest) {
			logger.info("Value "+2+" is present.");
		} else {
			logger.info("Value "+2+" is not present.");
		}

		//Remove
		String key ="parrot";
		Integer keyVal = cart.remove(key);
		if( keyVal != null)
			logger.info("After Removal of "+key+" Map: "+ cart);
		else
			logger.info("Removal fails "+key+" is not found");


		//Loop thru Map
		logger.info("Loop thru the Map");
		Set<Entry<String, Integer>>  es = cart.entrySet();
		Iterator<Map.Entry<String, Integer>> temp = es.iterator();
		Entry<String, Integer> temp1=null;
		while(temp.hasNext())
		{
			temp1 = temp.next();
			logger.info(temp1.getKey() + "   " + temp1.getValue());
		}

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(4, "Four");
		map.put(1, "One");

		logger.info("---- /Map Ends ----");
	}

}
