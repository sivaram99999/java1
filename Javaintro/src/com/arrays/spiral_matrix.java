package com.arrays;

import java.util.Arrays;

public class spiral_matrix {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{8,9,4},{7,6,5}};
	//	System.out.println(arr.length);
		
		int top= 0;
		int bottom = arr.length-1;
		int left =0;
		int right = arr.length-1;
		
		while(top<=bottom && left<=right) {
			//left to right
			
			for(int j = left; j<=right; j++) { 
				  System.out.print(arr[top][j] +" ");
				  
				  }
				    top++;
				  
			 // top to bottom		
			for(int i = top;i<=bottom; i++) {
				System.out.print(arr[i][right] + " ");
				
			}right--;
		// right to lift
			if(top<=bottom) {
			for(int j =right; j>=left; j--) {
			System.out.print(arr[bottom][j] +" ");
			
			}
			bottom--;
			}
			
			if( left<=right) {
				for(int i = bottom; i>=top; i-- ) {
					System.out.print(arr[i][left]+" ");
				}
				left++;
				
			}
			
			
		}
		

	}

}
