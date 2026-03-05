package com.PalindromeChecker;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class UCSevenPalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        

        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Add characters to deque
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        boolean isPalindrome = true;

        // Comparing characters from both ends
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (Character.toLowerCase(front) != Character.toLowerCase(rear)) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println("Is Palindrome? :  true");
        } else {
            System.out.println("Is Palindrome? : false");
        }

        sc.close();
    }
}