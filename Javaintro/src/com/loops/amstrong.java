package com.loops;

import java.util.Scanner;

public class amstrong {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		boolean status = isamst(n);
		if (status)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");

		
		sc.close();
	}

	 static boolean isamst(int n) {
		boolean status = false;
		int rem= 0;
		int sum = 0;
		int count = 0;
		int n1 =n;
		int temp=n;
		while (n>0) {
			rem = n%10;
			n = n/10;
			count++;
		}
		while(n1>0) {
			rem = n1%10;
			n1 = n1/10;
			sum = (int) (sum + Math.pow(rem, count));
			
		}
		if (temp == sum){
		
			status = true;
		}
		
		return status;
		
	 }

}
