package com.arrays;

public class even_odd {

	public static void main(String[] args) {
		int arr[] = {10,23,24,25,36};
		int counte =0;
		int counto = 0;
		
		for(int i = 0; i< arr.length; i++) {
			if (arr[i] % 2 == 0) {
				counte++;
			}else if(arr[i] % 2 != 2) {
				counto++;
			}
		}
		System.out.println("even elements :" + counte);
		System.out.println("odd elements :" + counto);

	}

}
