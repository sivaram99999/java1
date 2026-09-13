package com.case_study.Food_delivery_system;

import java.util.Scanner;

public class class_items {
	public String item_name;
	double  price;
//	double gst ;
//	double topping_price;
//	double packing_charge;
	public double total_amount;
	
	
	String get_item_name () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item name");
	    item_name=sc.next();
	    return item_name;
		
	}
	
	void display_item() {
		System.out.println("Item name :" + item_name);
		
		
	}
	
	double total_amount () {
		return total_amount;
	}

}
