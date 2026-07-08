package com.loops;

import java.util.Scanner;

public class readint {

	public static void main(String[] args) {		
		Scanner sc = new Scanner (System.in);
	    int n =1;
		
		while( n <= 5) {
		System.out.println("enter number");
		int m = sc.nextInt();
			if ( m%2==0 ) {
				n++;
				System.out.println(m);
			}
			else {
				System.out.println("enter number agin");
			}

		}
	}

}
