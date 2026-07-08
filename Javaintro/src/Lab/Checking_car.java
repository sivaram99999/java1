package Lab;
import java.util.Scanner;
public class Checking_car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter charactor");
		char C = sc.next().charAt(0);
		
		
		if (C >= 'A' && C <='Z') {
			System.out.println("upper case");
		}
		else if (C >= 'a' && C <= 'a'){
			System.out.println("lower case");
			
		}
		else if  (C >= '0' && C <= '9') {
			System.out.println("Number");
			
		}
		
		else {
			System.out.println("Special symbols");
		}
	}

}
