package POCS;

import java.util.Scanner;

public class Simple_exam_Model {

			static int qcount = 0;
		    static int acount = 0;
		    static String s ="";
		    static int nqcount=0;
		    

		    static void input(int n) {
		    	
		    	
		        if (n == 1) {
		            qcount++;
		            acount++;
		        } else if (n == 0) {
		            qcount++;
		        } else if (n == -1) {
//		           qcount = qcount - 1;
		        }
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        double per = 0.0;
		do {
		        for (int i = 1; i <= 20; i++) {
		            System.out.print("Enter answer for question " + i + " : ");
		            int n = sc.nextInt();
		            input(n);
		        }
		        per = (acount/20.0)*100;
		        if (per>40.0) {
		        	System.out.println("Your are pass");
		        }
		        else {
		        	System.out.println("Your are fail");
		        }
		        
		        nqcount = 20 - acount; 
		        System.out.println("Questions Attempted = " + qcount);
		        System.out.println("Correct Answers = " + acount);
		        System.out.println("Percentage of marks = " + per); 
		        System.out.println( "Number of not answered questions :" + nqcount);
		        System.out.println("Do you want to attend eaxm agin type yes for it ");
		       
		        s =sc.next();
		       
		    } while (s.equalsIgnoreCase("yes"));
		sc.close();
		    }
		    
		}