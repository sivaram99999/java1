package com.arrays;

public class matrix_sqare_reve {

	public static void main(String[] args) {
		int arr[] [] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0 ; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % 2!=0) {
					arr[i][j] = arr[i][i] * arr[i][j];
					System.out.println(arr[i][j]);
				}
				System.out.println();
			}
		}

	}

}
