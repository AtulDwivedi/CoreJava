/**
 * CareerYantra Powered by Cinque Education Pvt. Ltd.  All rights reserved.
 */
package corejava.array;

/**
 * @author 		Atul Dwivedi
 * @date 		Nov 22, 2013
 * @file 		Array1.java (CoreJava/array/Array1.java)
 * @description <>
 * @modified_by <> when <> what <>
 */
public class Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[10000];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=(int)(Math.random()*10000);
		}
		
		long startTm = System.currentTimeMillis();
		bubbleSort(arr1);
		long finishTm = System.currentTimeMillis();
		System.out.println(finishTm-startTm);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

	/**
	 * @param arr1
	 */
	private static void bubbleSort(int[] arr1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length-1; j++) {
				if (arr1[j] > arr1[j+1]) {
					arr1[j] = arr1[j] + arr1[j+1];
					arr1[j+1] = arr1[j] - arr1[j+1];
					arr1[j] = arr1[j] - arr1[j+1];
				}
			}
		}
	}
	
	//Bubble sort on Array
}
