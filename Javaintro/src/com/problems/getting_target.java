package com.problems;

import java.util.Scanner;

public class getting_target {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entre size of array");
		int size = sc.nextInt(); 
		int arr[] = new int[size];
		System.out.println("Enter Target Number");
		int tar =sc.nextInt();
		for(int i = 0; i<arr.length; i++) {
			System.out.println("enter array  elements");
			arr[i] =sc.nextInt();
			
		}

		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == tar) {
					System.err.println(i+"  "+j);
				
				}
			}
		}
		
		

	}

}
