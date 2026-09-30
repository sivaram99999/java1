package com.arrays;


import java.util.Scanner;

public class main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        int[][] grid = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int[][] dp = new int[R][C];
        dp[0][0] = grid[0][0];
        
        // Initialize the first row
        for (int j = 1; j < C; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        
        // Initialize the first column
        for (int i = 1; i < R; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        
        // Fill the rest of the DP table
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        
        System.out.println(dp[R - 1][C - 1]);
    }
}