//Checking Palindromes for Hard Coded Inputs



package com.PalindromeChecker;

public class UCTWOPalindromeChecker {
	public static void main(String[] args) {
		String input="madam";
		boolean isPalindrome=true;
		
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i) != input.charAt(input.length()-1-i)) {
				isPalindrome=false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("The string " + input + " is a Palindrome");
		}
		else {
			System.out.println("The string"+input+"not a palindrome");
		}
	}

}
