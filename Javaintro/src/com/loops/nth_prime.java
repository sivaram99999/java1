package com.loops;

import java.util.Scanner;

public class nth_prime {
	 static boolean isPrime(int n) {
		boolean status = true;
		if(n<=1) {
			return false;
		}
		for (int i = 2; i <=n/2 ; i++) {
			if (n % i == 0) {
				return false; 
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nth number");
		int n = sc.nextInt();
		int count = 0;
		
		
		
		for(int i = 0 ; ; i++) {
			if(isPrime(i)) {
				count++;
				
				if (count == n) {
					System.out.println(i);
					break;
				}
			}
			
		}
		
sc.close();
	}

}
