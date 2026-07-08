package Lab;
import java.util.Scanner;
public class ticket {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter category :");
		String CAT = sc.nextLine();
		
		switch (CAT) {
		case "g" :
			System.out.println("GOLD PRICE : 450");
			
		break;
		case "p" :
			System.out.println("Prime PRICE : 250");
			
		case "n" :
			System.out.println(" Normal PRICE : 150");
			
			
		
		}
	}

}
