package com.pay_role;

import java.util.Scanner;

public class employee {
	int empId;
    String empName;
   static double basicSalary;
Scanner sc = new Scanner(System.in);

  void get_emp_info() {
	  System.out.println("Enter Employee ID : ");
	  this.empId = sc.nextInt();
	  System.out.println("Enter Employee Name : ");
	  this.empName = sc.next();
	  System.out.println("Enter Basic Salary of Employee: ");
	  this.basicSalary = sc.nextDouble();
	  
  }
  
  
  void display_emp_details() {
	 
		    System.out.println("Employee ID : " + empId);
		    System.out.println("Employee Name : " + empName);
		    System.out.println("Basic Salary : " + basicSalary);
		}
double net_salary () {
	
	return basicSalary;
	
}
}