package com.case_study;

public class case_study5 {

	public static void main(String[] args) {
		int sales[]= {15,0,8,0,20,5};
		int j = 0;
		
		for(int i  = 0; i < sales.length; i++) {
			
			
			if(sales[i] != 0) {
				int tem =sales[i];
				sales[i] = sales[j];
				sales[j] = tem;
				j++;
			}
			
				
			}
		while (  j < sales.length ) {
			sales[j] = 0;
			j++;
		}
		
		for(int sal : sales) {
			System.out.println(sal +" ");
			
		}
		}

	

}
