package Cricket_Selection;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name :");
		String name = sc.next();
		System.out.println("Enter Your City :");
	    String city = sc.next();
		System.out.println("What Was Your Role :");
	    String role = sc.next();
	    
	    Player p  =new Player(name, city, role);
	    
	   

	}

}
