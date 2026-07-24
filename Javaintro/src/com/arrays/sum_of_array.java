package com.arrays;

public class sum_of_array {
	void main() {

		int[] arr = { 10, 30, 90, 10, 20 };
		int[] arr1 = { 10, 40, 50, 60 };
		if (arr.length > arr1.length) {
			int[] sum = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr1.length; j++) {
					if (i == j) {

						sum[i] = arr[i] + arr1[j];
					} else if (i > j) {
						sum[i] = arr[i] + 0;

					} else if (i < j)
						sum[j] = arr1[j] + 0;
				}
			}
			 
			 for(int s : sum) {
				 System.out.print(s + " ");
			 }
		} else {
			int[] sum = new int[arr1.length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr1.length; j++) {
					if (i == j) {

						sum[i] = arr[i] + arr1[j];
					} else if (i > j) {
						sum[i] = arr[i] + 0;

					} else if (i < j)
						sum[j] = arr1[j] + 0;
				}
			}
			 
			 for(int s : sum) {
				 System.out.print(s + " ");
			 }
		}
//	 int[] sum = new int[arr.length + arr1.length];

		/*
		 * for(int i = 0; i < arr.length; i++) { for(int j = 0; j< arr1.length; j++) {
		 * if (i == j) {
		 * 
		 * sum[i] = arr[i] + arr1[j]; } else if(i> j) { sum[i] = arr[i] + 0;
		 * 
		 * } else if(i<j) sum[j] = arr1[j] + 0; } }
		 * 
		 * for(int s : sum) { System.out.print(s + " "); }
		 */
	}
}
