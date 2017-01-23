package corejava.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, String> myhash = new HashMap<String, String>();
		myhash.put("Me", "Present");
		System.out.println(hashContainsKey1(myhash, "Me"));
	}
	
	public static boolean hashContainsKey(HashMap<String, String> hash, String key) {
		return hash.containsKey(key);
	}
	
	public static boolean hashContainsKey1(Map hash, String key) {
		System.out.println("here");
		return hash.containsKey(key);
	}
}
