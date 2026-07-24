package com.arrays;

import java.util.Arrays;

public class Inserction_sort {

	public static void main(String[] args) {
		int arr[] =  {10,20,40,22,444,11,4};
		int temp;
		int j;
		for (int  i = 0; i< arr.length;i++) {
			temp = arr[i];
			j=i;
			while(j>0 && arr[j-1]> temp) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp; 
		}
		System.out.println(Arrays.toString(arr));

		

	}

}
