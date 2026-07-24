package com.arrays;

import java.util.Scanner;

public class findmax_min {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter range : ");
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		for (int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		//	System.out.println(arr[i]);
		}
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<=arr.length ;i++) {
			if(max > arr[i]) {
				System.out.println(max);
			}else if(min < arr[i]) {
				System.out.println(min);
			}
			
		System.out.print(i + " ");
		}
	}

}
