package com.case_study.Food_delivery_system;

public class class_piza extends class_items {
	@Override
	double total_amount () {
		price= 250;
		double topping_price= price *.10;
		total_amount = price + topping_price ;
		return total_amount;
	}

}
