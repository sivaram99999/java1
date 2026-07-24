package com.arrays;

public class Second_highest_element {

	public static void main(String[] args) {
		int  arr[] = {10,20,3,5,4,};
		int max = arr[0];
		int sec_max = arr[0];
		for(int  i = 0; i < arr.length; i++) {
			
			if(arr[i] < max) {
				sec_max= max;
				max = arr[i];
				
				
			}
		}
		System.out.println(sec_max);

	}

}
