package com.arrays;

import java.util.Arrays;

public class reverse_matrix {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr[i].length; j++) {
				int temp = arr[i][j];
			//	System.out.print(temp);
				 arr[i][j] = arr[j][i];
				 arr[j][i] = temp;
		//		 System.out.println(arr[i][j]);
				
				
			}
			
			
		
		
		
		}System.out.print(Arrays.deepToString(arr));

	}

}
