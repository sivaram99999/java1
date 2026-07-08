package com.loops;

import java.util.Scanner;

public class range_whileofno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		System.out.println("enter m");
		int m =  sc.nextInt();
		
		while (n<=m) {
			System.out.println(n);
			n++;
		}
	
	
	}
	

}
