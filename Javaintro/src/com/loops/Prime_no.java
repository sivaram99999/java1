package com.loops;

import java.util.Scanner;

public class Prime_no {
	static boolean isPrime(int n) {
		boolean status = true;
		if ( n == 0 || n ==1) {
			return false;
		}
		for(int i = 2 ; i<=n/2; i++) {
			if(n%i == 0) {
			
				status = false;
			}
		}
		return status;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0 ; i<= n ;i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
				
			}
			
		}
		
		
	}

}
