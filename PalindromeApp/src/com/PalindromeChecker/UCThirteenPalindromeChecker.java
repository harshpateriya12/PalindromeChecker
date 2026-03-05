package com.PalindromeChecker;

import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack Strategy
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

// Deque Strategy
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

// Performance Runner
class AlgorithmRunner {

    public static void runAlgorithm(String name, PalindromeStrategy strategy, String input) {

        long startTime = System.nanoTime();

        boolean result = strategy.checkPalindrome(input);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Algorithm: " + name);
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time (ns): " + executionTime);
       
    }
}

public class UCThirteenPalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String input = sc.nextLine();

       

        // Run multiple algorithms
        AlgorithmRunner.runAlgorithm("Stack Strategy", new StackStrategy(), input);
        AlgorithmRunner.runAlgorithm("Deque Strategy", new DequeStrategy(), input);

        sc.close();
    }
}