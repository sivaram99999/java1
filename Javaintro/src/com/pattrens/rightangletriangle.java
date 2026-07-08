package com.pattrens;

import java.util.Scanner;

public class rightangletriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		for(int i = n; i >= 1; i--) {
			
			for(int j = 1; j>=n+1-i; j++) {
				System.out.println(" * ");
			}
			System.out.println();
		}

	}
}
