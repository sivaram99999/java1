package com.arrays;

public class max_sum_of_sub_array {
	static int sum = 0;
	static int maxsum;

	public static void main(String[] args) {
		int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		 for ( int i = 0;  i< arr.length; i++) {
			 for(int j = i ; j<arr.length; j++) {
				 for(int k = i; k<= j; k++) {
					 
					 maxsum = maxsum  + arr[k];
					// System.out.print(arr[k]+" ");
					 System.out.println("sub array sum"+sum);
					// System.out.print(":");
					// System.out.print(sum);
					 if(maxsum > sum) {
					//	 max
						 
					 }
				 }
				 System.out.println();
				 
			 }
		 }
		
		 
	}

}
