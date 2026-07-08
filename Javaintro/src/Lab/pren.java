package Lab;

import java.util.Scanner;

public class pren {
	
	static void prefect(int n1) {
		int sum = 0;
		for(int i = 1 ; i<=n1/2 ; i++) {
			if ( n1  % i ==  0) {
				sum = sum + i;
			}
			
			}
		if (sum == n1 ) {
				System.out.println( n1 + "prefect number ");
		}
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter n ");
		int n = sc.nextInt();
		
		for(int i  = 1;  i<=n ; i++) {
			prefect(i);
			
		}

	}

}
