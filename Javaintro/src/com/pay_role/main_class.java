package com.pay_role;

import java.util.Scanner;

public class main_class {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("1. Full Time");
	        System.out.println("2. Part Time");
	        System.out.println("3. Contract");

	        int choice = sc.nextInt();
	        employee emp;
	        switch (choice) {
            case 1:
                emp = new full_time_emp();
                break;

            case 2:
                emp = new Part_time_emp();
                break;

            case 3:
                emp = new Contract_emp();
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        emp.get_emp_info();
        emp.display_emp_details();

        System.out.println("Net Salary = " + emp.net_salary());
	}

}
