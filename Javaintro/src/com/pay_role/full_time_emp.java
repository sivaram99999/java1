package com.pay_role;

public class full_time_emp extends employee {
	 @Override
	double net_salary () {
		this.basicSalary = basicSalary;
		double HRA = basicSalary * 0.20;
		double DA = basicSalary * 0.10;
		
		double net_salary= (basicSalary) + HRA + DA ;
		return net_salary;

}
}
