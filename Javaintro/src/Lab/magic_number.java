package Lab;

import java.util.Scanner;

public class magic_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int Orignal = num;
	
		int r;
		int rev = 0;
	//	int num1 =0;
		
		while (num > 9) {
		int sum = 0;
		while (num> 0) {
			 r  = num%10;
		     sum = sum + r;
	//	     rev = rev * 10 + r;
		     num = num/10;
		}
		 num = sum;
		 System.out.println(sum);
		}
		
		if ( num == 1) {
			System.out.println( Orignal + "it is magic number");
		}
		
	}

}
