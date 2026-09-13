package com.case_study.Food_delivery_system;

public class class_Burger extends class_items{
	@Override
	double total_amount () {
		price = 120;
		double packing_charge = price *.05;
		total_amount = price + packing_charge;
		return total_amount;
	}

}
