package com.PalindromeChecker;

import java.util.Scanner;

// PalindromeChecker class
class PalindromeChecker {

 // Public method to check palindrome
    public boolean checkPalindrome(String input) {

  // Normalize string (remove spaces and convert to lowercase)
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        return isPalindrome(processed, 0, processed.length() - 1);
    }

  // Recursive palindrome logic
    private boolean isPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }
}

public class UCElevenPalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}