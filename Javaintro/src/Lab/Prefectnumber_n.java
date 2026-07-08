package Lab;

import java.util.Scanner;

public class Prefectnumber_n {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr range of n :");
	int n = sc.nextInt();
	
	for (int i = 1; i<=n ; i++) {
		 int sum = 0;
		for ( int j = 1; j<i ; j++ ) {
			if (i % j == 0) {
				sum = sum + j;
			}	
		}
		if (sum == i) {
				System.out.println(i +"perfect number");
				
			}	
	//	System.out.println(i + " " + sum);
	}
	
	
	//	System.out.println(sum);
	//	if (sum == n) {
	//		System.out.println(n +"perfect number");
			
	//	}

	}

}
