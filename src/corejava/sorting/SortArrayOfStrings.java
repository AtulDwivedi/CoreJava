package corejava.sorting;

import java.util.Arrays;

public class SortArrayOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"Pine Apple", "Mango", "Banana", "Apple"};
		
		Arrays.sort(fruits);
		
		for(String temp: fruits){
			System.out.println(temp);
		}
	}

}
