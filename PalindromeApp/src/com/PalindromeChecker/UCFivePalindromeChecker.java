package com.PalindromeChecker;

import java.util.Stack;
import java.util.Scanner;

public class UCFivePalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

       

       
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 1: Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Step 2: Pop characters and form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("Is Palindrome? : True" );
        } else {
            System.out.println("Is Palindrome? : False");
        }

        sc.close();
    }
}