package com.loops;

import java.util.Scanner;

public class factors_prefect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER N");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i<= n/2 ; i++) {
			if( n%i == 0) {
				System.out.println(i +" ");
				sum += i;
			}
				
			
		}
		if (sum == n) {
			System.out.println("prefect number");
		}
		else {
			System.out.println("not prefect");
		}
		
sc.close();
	}

}
