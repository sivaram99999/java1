package com.arrays;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of words
        if (!scanner.hasNextInt()) {
            System.out.println("NONE");
            return;
        }
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("NONE");
            return;
        }
        
        // Read the words into an array
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        
        // Find the longest common prefix
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            // Keep shortening the prefix until it matches the start of words[i]
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    break;
                }
            }
        }
        
        // Print the result or "NONE" if empty
        if (prefix.isEmpty()) {
            System.out.println("NONE");
        } else {
            System.out.println(prefix);
        }
        
        scanner.close();
    }
}
