package com.arrays;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of elements
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // Map to store the frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0;
        int result = Integer.MAX_VALUE;
        
        // Find the element with the maximum frequency
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            
            if (freq > maxFreq) {
                maxFreq = freq;
                result = num;
            } else if (freq == maxFreq) {
                // If frequencies match, choose the smaller number
                if (num < result) {
                    result = num;
                }
            }
        }
        
        // Print the final result
        System.out.println(result);
        
        sc.close();
    }
}