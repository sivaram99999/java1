package com.arrays;

public class Remove_duplicates {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,1,32,22,33,33,34};
		
		
		
		for (int i = 0; i<arr.length; i++) {
			boolean dup = false;
			for(int j = 0 ; j < i; j++) {
				if(arr[i] == arr[j]) {
					dup = true;
					break;
					
				}
				/*
				 * if(!dup) { System.out.println(arr[i] + " "); }
				 */

			}
			if(!dup) {
				System.out.println(arr[i] + " ");
			}
		}
	}

}
