package com.PalindromeChecker;

import java.util.*;

// Step 1: Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Step 2: Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
        }

        for(char c : str.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Step 3: Deque Strategy Implementation
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String str = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// Context Class


// Main Class
public class UCTwelvePalindromeChecker {

    public static void main(String[] args) {
    	
    	
    	class PalindromeChecker {

    	    private PalindromeStrategy strategy;

    	    public PalindromeChecker(PalindromeStrategy strategy) {
    	        this.strategy = strategy;
    	    }

    	    public boolean check(String input) {
    	        return strategy.checkPalindrome(input);
    	    }
    	}

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String input = sc.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if(choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.check(input);

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}