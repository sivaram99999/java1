package com.loops;

import java.util.Scanner;

public class sumofnumberswhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number n ");
		int n = sc.nextInt();
		int Orignal = n;
		int sum = 0;
		int r;
		int rev = 0;
		
		while (n> 0) {
			 r  = n%10;
			
		     sum = sum + r;
		     rev = rev * 10 + r;
		     n = n/10;
		     
		
		}
		System.out.println(sum);
		System.out.println(rev);
		
		if (rev == Orignal ) {
			System.out.println("it was a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
sc.close();
	}

}
