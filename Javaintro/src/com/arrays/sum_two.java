package com.arrays;

public class sum_two {

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,9,7};
		int target = 9;
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				
				if ( arr[i]+arr[j] == target) {
					System.out.print(i+" ");
					System.out.print(j+" ");
					return;
				}
			}
		}

	}

}
