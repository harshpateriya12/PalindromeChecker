package com.PalindromeChecker;

import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UCEightPalindromeChecker {

    // Reverse linked list
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Linked List Based Palindrome Checker -----");
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Step 1: Convert string to linked list
        Node head = null;
        Node tail = null;

        for (int i = 0; i < str.length(); i++) {
            Node newNode = new Node(str.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find middle using slow and fast pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node temp = secondHalf;
        boolean isPalindrome = true;

        while (temp != null) {
            if (Character.toLowerCase(firstHalf.data) != Character.toLowerCase(temp.data)) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Output result
        if (isPalindrome) {
            System.out.println("Is Palindrome? :  true");
        } else {
            System.out.println("Is Palindrome? : false");
        }

        sc.close();
    }
}