package com.arrays;

import java.util.Scanner;

public class digit_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter range of array : ");
		int a = sc.nextInt();
		int []arr =new int[a];
		int count = 0;
		
		for (int i = 0; i< arr.length; i++ ) {
			arr[i] = sc.nextInt();
//	System.out.println(arr[i]);
		}
		for(int i = 0; i<a ; i++) {
		    while(arr[i]>0) {
		    	int r=arr[i]%10;
		    	arr[i]=arr[i]/10;
		    	if ( r == 2) {
		    	 count++;
		    	}
		    }
			
		}
		
		System.out.println("count of 2s :" + count);

	}

}
