package com.case_study.Food_delivery_system;

public class food_del {

	public static void main(String[] args) {
		System.out.println("Welcome to SIVS HOME FOOD");
		
		System.out.println("What type of food item do  you want");
		class_items  ci = new class_items();
		
		
        String itemName = ci.get_item_name();

		if (itemName.equalsIgnoreCase("biryani")){
			ci.total_amount () ;
		}
		
		
		
		
		

	}

}
