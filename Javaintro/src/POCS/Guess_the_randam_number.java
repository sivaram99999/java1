package POCS;
import java.util.*;
public class Guess_the_randam_number {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int num = r.nextInt(10);
	//	System.out.println(num);
		int unum = 0;
		String s = "";
do {
		for(int i = 1 ; i <= 3 ; i++) {
			System.out.println("Enter your guessed  number :");
			unum = sc.nextInt();
			
			
			if(unum < num&i<=2) {
				System.out.println("you are  to low");
			}else if(unum > num&&i<=2) {
				System.out.println("you are  to high");
			}else if(i==3) {
				System.out.println("better luck next time ");
				System.out.println("Do you want to play agin enter y for it ");
				s= sc.next();
				break;
			}
			if (unum == num) {
				System.out.println("You are won the game");
				System.out.println("Do you want to play agin enter y for it ");
				s= sc.next();
				
			
			}
			
		}
}while (s.equalsIgnoreCase("y"));

sc.close();
		
	}

}
