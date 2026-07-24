package com.arrays;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter range of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int rev = 0;
		
		
		
		for (int i = 0; i<arr.length ; i++)	{
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n ; i++) {
			while(arr[i]>0) {
			int r = arr[i] % 10;
		//	StringBuilder sb = new StringBuilder();
			
			 arr[i] =arr[i]/10;
			  rev =rev * 10 + r;
			
		}
		}
		System.out.println(rev);
	}

}
