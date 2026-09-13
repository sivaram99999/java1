package com.pay_role;

public class Part_time_emp  extends employee{
	@Override
	double net_salary () {
		this.basicSalary = basicSalary;
		double  Allowance = basicSalary * 0.05;
	
		
		double net_salary= (basicSalary) +  Allowance;
		return net_salary;

}
	
	

}
