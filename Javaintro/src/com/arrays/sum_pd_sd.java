package com.arrays;

import java.util.Scanner;

public class sum_pd_sd {

	public static void main(String[] args) {
		int psum = 0;
		int ssum= 0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter rows range");
	 int rows =sc.nextInt();
	 System.out.println("Enter column range");
	 int column =sc.nextInt();
	 int [][] arr = new int[rows][column];
	 
	 for(int i =0 ; i<rows; i++) {
		 for(int j = 0; j< column; j++) {
			 arr[i][j] = sc.nextInt();
		 }
		 
	 }
	 for(int i = 0; i<arr.length; i++) {
		 for(int j =0; j<arr.length; j++) {
			 if(i == j) {
				 psum = psum +arr[i][j];
				 
			 }
			 else if( i+j == arr[i].length-1) {
				 ssum =ssum + arr[i][j];
				 
			 }
		 }
	 }
	 
	 
	 System.out.println(psum);
	 System.out.println(ssum);
	 int totalsum = psum+ssum;
	 System.out.println(totalsum);
	 
	}

}
