//For checking palindrome using character array


package com.PalindromeChecker;
import java.util.Scanner;

public class UCFourPalindromeChecker {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input =sc.nextLine();
		boolean result=isPalindrome(input);
		displayResult(input,result);
	}
	
	public static boolean isPalindrome(String input) {
		char[] chars = input.toCharArray();
		
		int start=0;
		int end=chars.length-1;
		
		while(start<end) {
			if(chars[start] != chars[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void displayResult(String input,boolean result) {
		System.out.println("Input: " + input);
		System.out.println("Is Palindrome? : "+ result);
	}

}
