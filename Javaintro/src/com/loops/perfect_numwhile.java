package com.loops;

import java.util.Scanner;

public class perfect_numwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i<n) {
			if( n%i == 0) {
				System.out.print(i +" ");
				sum += i;
			}
			 i++;
		}

        System.out.println("Sum = " + sum);

        if (sum == n) {
            System.out.println(n + " is a Perfect Number");
        } else {
            System.out.println(n + " is Not a Perfect Number");
        }

        sc.close();
	}

}
