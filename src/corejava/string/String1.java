/**
 * CareerYantra Powered by Cinque Education Pvt. Ltd.  All rights reserved.
 */
package corejava.string;

import java.util.Scanner;

/**
 * @author Atul Dwivedi
 * @date Nov 22, 2013
 * @file String.java (CoreJavaClasses/corejava.string/String.java)
 * @description <>
 * @modified_by <> when <> what <>
 */
public class String1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello a olleH";
		
		
		String str = "aaaa aabaa bbb samaaiaaksl iiii aisk";
		String1 strObj = new String1();	
		String palindromeWords="";
		String wordswithVowelInMid="";
		
		if(strObj.isPalindrome(s))
			System.out.println("Yes, "+s+" is a Palindrome.");
		
		Scanner scnr = new Scanner(System.in);
		String original = scnr.nextLine();
		String reverse = "";
		
		for (int i = original.length(); i <= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
		
		
		String[] strArr= str.split(" ");
		
		for (int i = 0; i < strArr.length; i++) {
			if (strObj.isPalindrome(strArr[i])) {
				palindromeWords +=strArr[i]+" ";
			}
			else {
				
			}
			if (strObj.hasVowelInMid(strArr[i])) {
				wordswithVowelInMid +=strArr[i]+" ";
			}
		}
		System.out.println("Palindrome Words: "+palindromeWords);
		System.out.println("Words with Vowel in Middle: "+wordswithVowelInMid);
		

		
	}

	//Check whether the middle character of corejava.string is vowel or not
	boolean hasVowelInMid(String str)
	{
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(str.length()/2)=='i') {
				return true;
			}
		}
		return false;
	}
	
	// Check whether passed corejava.string is palindrome or not.
	boolean isPalindrome(String str) {
		for (int i = 0; i < (str.length() / 2) + 1; ++i) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}

}
