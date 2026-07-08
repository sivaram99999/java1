package com.loops;

import java.util.Scanner;

public class factoresusing_recursion {

	
	static int fact(int n) {
		
		if (n==0 || n==1) {
			return 1;
		}
		
		return n * fact(n-1);
		
	}
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        int result = fact(n);

	        System.out.println("Factorial = " + result);

	        sc.close();
	    }
	}


