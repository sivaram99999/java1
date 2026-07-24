package com.arrays;

public class sum_of_two_arrays {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		int [] arr2 = {20,50,70};
		int[] arr3 = new int[arr1.length + arr2.length];
		int a =0;
		/*
		 * for(int arr : arr1) { arr3[a] = arr; a++;
		 * 
		 * } for(int arr : arr2) { arr3[a] = arr; a++; } for(int arr : arr3) {
		 * System.out.println(arr); }
		 */
		for (int i = 0 ; i<arr1.length; i++) {
			arr3[i] = arr1[i];
			
		}
		for(int i = 0; i< arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}

		for(int arr : arr3) {
			System.out.println(arr);
		}
		
	}

}
