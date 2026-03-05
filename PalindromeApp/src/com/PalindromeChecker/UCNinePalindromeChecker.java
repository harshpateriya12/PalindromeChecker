package com.PalindromeChecker;

import java.util.Scanner;

public class UCNinePalindromeChecker {
	public static boolean isPalindrome(String s, int start, int end) {
		if(start >= end) {
			return true;
		}
		
		if(s.charAt(start) != s.charAt(end)) {
			return false;
		}
		
		return isPalindrome(s, start + 1, end - 1);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String input = sc.next();
		
		int n = input.length();
		
		System.out.println("Input String: " + input);
		
		
		
		boolean pall = isPalindrome(input, 0, n-1);
        
        
        System.out.println("Is Pallindrome: " + pall);
	
	}
}