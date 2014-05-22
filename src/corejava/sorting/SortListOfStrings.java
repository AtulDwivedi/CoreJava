package corejava.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<String>();
		fruits.add("Pine Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		
		Collections.sort(fruits);
		
		for (String temp : fruits) {
			System.out.println(temp);
		}
	}

}
