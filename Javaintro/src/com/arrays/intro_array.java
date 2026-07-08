package com.arrays;

import java.util.Scanner;

public class intro_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter range of array");
		int n = sc.nextInt();
		int sum = 0;
		
		int[] ages =  new int[n];
		for (int i = 0; i<n; i++) {
			 ages[i] = sc.nextInt();
		}
		System.out.println("array items are :");
		for (int age : ages ) {
			System.out.println(  age);
			sum = sum + age;
			
		}
		
		System.out.println( "total of array "+ sum);
	
		
	}
		
		

}
 