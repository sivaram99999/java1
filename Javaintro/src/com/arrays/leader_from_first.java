package com.arrays;

public class leader_from_first {

	public static void main(String[] args) {
		int arr[]= {16,17,5,4,3,8,9,7};
		boolean status = false;
		for(int i = 1; i <arr.length; i++) {
		 boolean leader  = true;
			for(int j = i+1; j< arr.length; j++) {
				if(arr[j] > arr[i]) {
					leader = false;
					break;
					

			}
		}
				
			if (leader) {
					System.out.println(arr[i]);
				}			
		}
	}
}
