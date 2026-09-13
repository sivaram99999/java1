package com.arrays;

public class discount_array {

	public static void main(String[] args) {
		
		
		  
		        int arr[]={8,4,6,2,3};
		        int[] result = new int[arr.length];
		     //   int num =0;
		        for(int i = 0; i< arr.length; i++){
		           result[i]= arr[i];
		           for(int j =i+1; j < arr.length; j++){
		              if(arr[j] <= arr[i]) {
		                  result[i] = arr[i]- arr[j];
		                  break;
		              }
		           
		           } 
		            }
		for(int num: result){
		    System.out.println(num + " ");
		}
		        

		        
		    }
		

	}


