package com.case_study;

import java.util.Scanner;

public class Case_study2 {
	static Scanner sc = new Scanner(System.in);
static {
	System.out.println("WELCOME TO MY LAIBRARY");
}
	public static void main(String[] args) {
		Case_study2 CS = new Case_study2();
		System.out.println("DO YOU HAVE LAIBRARY CARD");
		String card = sc.nextLine();;
		int no_books = 0;
		
		if (card.equalsIgnoreCase("yes")) {
			System.out.println("Enter your laibrary card id");
			int id = sc.nextInt();
			sc.nextLine();
			switch (id) {
			case 201:
				no_books = 2;
				break;
				
			case 202:
				no_books = 3;
				break;
			case 203:
				no_books =2;
				break;
			case 204:
				no_books =0;
				break;
			default:
				System.out.println("Invalid id ");
			} 
			
		}
		
		else {
			System.out.println("YOU HAVE TO HAVE ID CARD FOR BARROW BOOKS");
			return;
		}
	
		if (no_books>=3) {
			System.out.println("YOU DON'T LIMIT TO TAKE NEW BOOKS YOU HAVE TO RETURN PREVIOUS BOOKS TO TAKE NEW BOOKS");
		}
		else if (no_books==2) {
			System.out.println("YOU CAN TAKE ONE MORE BOOK");
			CS.book_info();
		}
		else if (no_books==1){
			System.out.println( "YOU CAN TAKE TWO MORE BOOKS");
			CS.book_info();
		}
		else {
			System.out.println("YOU CAN TAKE THREE BOOKS");
			CS.book_info();
		}	
}	
	
	void book_info() {
		System.out.println("SELECT BOOKS CATEGORY");
	//	String category = sc.nextLine();
		System.out.println("FECTION");
		System.out.println("SCIENCE");
		System.out.println("HISTORY");
		String category = sc.nextLine();
		
		switch(category) {
		
		case "fection":
			System.out.println("YOU HAVE TO RETURN IN 7 DAYS");
			break;
		case "science":
			System.out.println("YOU HAVE TO RETURN IN 14 DAYS");
			break;
		case "histoyr":
			System.out.println("YOU HAVE TO RETURN IN 21 DAYS");
			break;
			
		default:
			System.out.println("INVALID CATEGORY");
		}
		
	}

}
