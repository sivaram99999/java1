package com.case_study.Food_delivery_system;

public class class_Biryani extends class_items{
	@Override
	double total_amount () {
		price = 350;
		double gst = price * .10;
		total_amount = price + gst;
		return total_amount;
	}

}
