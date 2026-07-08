package com.loops;
import java.util.*
;

public class febnosis_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter n ");
		int n = sc.nextInt();
		int n1 = 0;
		int  n2 = 1;
		int n3 ;
		for (int i = 1; i <= n ; i++) {
			System.out.println(n1+ " ");
			n3 =n1+n2;
			n1 = n2;
			n2 = n3;
			sc.close();
		}

	}

}
