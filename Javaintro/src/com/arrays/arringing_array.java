package com.arrays;

public class arringing_array {

	public static void main(String[] args) {
		int arr[] = {1,-5,4,-9,8};
	
		int left = 0;
		int right =arr.length-1;
		while(left<right) {
			while(left<right && arr[left]<0) 
				left++;
			  while (left < right && arr[right] >= 0)
	                right--;

			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		for(int arr1:arr) {
			System.out.print(arr1 + " ");
		}
			

	}

}
