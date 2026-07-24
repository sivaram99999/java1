package com.case_study;

public class Case_study4 {

	public static void main(String[] args) {
		int count =0;
		int passcount=0;
		int failcount=0;
		double avg =0.0;
		int sum = 0;
		/*
		 * int max = 0; int min =0;
		 */
		int[] marks = {50,20,55,44,78,90,96,88,55,45,50,
				20,55,44,78,90,96,88,55,45,50,
				20,55,44,78,90,96,88,55,45,50,
				20,55,44,78,90,96,88,55,45,50,
				20,55,44,78,90,96,88,55,45};
		int high = marks[0];
		int low = marks[0];
		for(int i =0; i<marks.length; i ++) {
			count++;
			sum = sum + marks[i];
			if( marks[i]> high) {
				high = marks[i];
				}else if( marks[i] < low) {
					low = marks[i];
				}else if(marks[i] <=35) {
					failcount++;
				}else if(marks[i]>=36) {
					passcount++;
				}
		 
			avg = sum / marks.length;
		
			 
		}
		System.out.println("highest marks of given students : "+ high);
		System.out.println("Lowest marks of given students : "+ low);
		System.out.println("Number of pass students : "+ passcount);
		System.out.println("Number of fail  students : "+ failcount);
		System.out.println("Averege of class  : "+ avg);
		
		
		System.out.println("Total number  of students in class  : "+ count);
		
		
	}

}
