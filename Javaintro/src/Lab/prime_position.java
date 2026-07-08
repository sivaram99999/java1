package Lab;

import java.util.Scanner;

public class prime_position {
	
	static boolean isprime(int n) {
		boolean status = true;
		if(n<2) {
			return false;
		}
		for (int i = 2; i <=n/2 ; i++) {
			if (n % i == 0) {
				return false; 
			}
		}
		return status;
	
	}

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter number range ");
	int range =  sc.nextInt();
	int count = 0;
	
	for (int i  = 2 ; i<=range ; i++) {
		if(isprime(i)) {
			count++;
		//	System.out.println(i);
		
	
		if (isprime(count) ) {
		System.out.println(i);
		}
	}	
}	
//	System.out.println("no of prime number between 1 to "+ range + " "+count);
	}

}

























