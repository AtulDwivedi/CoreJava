package corejava.collection.map;

import java.util.Iterator;
import java.util.Map;

public class LoopThruMap {

	/**
	 * Using keySet
	 * keySet returns Set of keys
	 */
	public void usingKeySet(Map<Integer, String> map){
		for(Integer key: map.keySet()){
			System.out.println("Key: "+key);
		}
	}

	/**
	 * Using entrySet
	 * entrySet returns Set of entries (i.e. Map.Entry<K,V>)
	 */
	public void usingEntrySet(Map<Integer, String> map){
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
	}
	
	/**
	 * Using ketSet and Iterator
	 */
	public void usingKeySetAndIterator(Map<Integer, String> map){
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()){
			Integer intgr = itr.next();
			System.out.println("Key: "+intgr);
		}
	}

	/**
	 * Using entrySet and Iterator
	 */
	public void usingEntrySetAndIterator(Map<Integer, String> map){
		Iterator<Map.Entry<Integer, String>> itrtr = map.entrySet().iterator();
		while (itrtr.hasNext()) {
			Map.Entry<Integer, String> entry = itrtr.next();
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
		}
	}
}
