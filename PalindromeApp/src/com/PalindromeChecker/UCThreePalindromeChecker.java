//Checking Palindrome using reversed string



package com.PalindromeChecker;
import java.util.Scanner;

public class UCThreePalindromeChecker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String input = sc.nextLine();
		
		String reversed =reverseString(input);
		boolean result= checkPalindrome(input,reversed);
		
		displayOutput(input,reversed,result);
		
		
	}
	public static String reverseString(String input) {
		String reversed="";
		for(int i=input.length()-1;i>=0;i--) {
			reversed=reversed+input.charAt(i);
		}
		return reversed;
	}
	public static boolean checkPalindrome(String original,String reversed) {
		return original.equals(reversed);
	}
	
	public static void displayOutput(String original,String reversed,boolean result) {
		System.out.println("Original : " + original);
		System.out.println("Reversed : " + reversed);
		System.out.println("Is Palindrome? : " + result);
		
	}
	

}
