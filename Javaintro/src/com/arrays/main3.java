package com.arrays;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) {
            return;
        }
        
        String s = sc.next();
        int n = s.length();
        StringBuilder compressed = new StringBuilder();
        
        int i = 0;
        while (i < n) {
            char current_char = s.charAt(i);
            int count = 0;
            
            // Count consecutive occurrences of the current character
            while (i < n && s.charAt(i) == current_char) {
                count++;
                i++;
            }
            
            // Append character followed by its frequency
            compressed.append(current_char).append(count);
        }
        
        System.out.println(compressed.toString());
    }
}
