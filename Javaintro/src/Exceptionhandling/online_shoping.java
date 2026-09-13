package Exceptionhandling;

import java.util.Scanner;

public class online_shoping {
	static Scanner sc = new Scanner(System.in);
	static String price;
	public static void main(String[] args) {
		try {
		System.out.println("Enter price of product");
		price =sc.next();
		double value1 = Double.parseDouble(price);  
		}catch(Exception e) {
		System.out.println(e);
	}
		
		
		
		
//		System.out.println(price);
		System.out.println("hiiihihiiiiiiiiiiii");
		
	

	}

}
