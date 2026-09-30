




package com.arrays;

import java.util.*;

public class Main {

    public static String canDivide(int[] arr) {

        int total = 0;

        for (int num : arr) {

            total += num;

        }

        // Equal groups must each have total/2

        if (total % 2 != 0) {

            return "NO";

        }

        int target = total / 2;

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int num : arr) {

            for (int j = target; j >= num; j--) {

                dp[j] = dp[j] || dp[j - num];

            }

        }

        return dp[target] ? "YES" : "NO";

    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 11, 5};

        System.out.println(canDivide(arr));

    }

}