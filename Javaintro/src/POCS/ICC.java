package POCS;

import java.util.Scanner;

public class ICC {
	
	

	public static void main(String[] args) {
		System.out.println("Cricket is gentelmens game");
		Scanner sc = new Scanner(System.in);
		String continueChoice="";
		do {
			
		
		System.out.println("Enter Countery Name :");
		String Country = sc.nextLine();
		ICC icc = new ICC();
		String yes ="";
		int tons=0;
		int totaltons=0;

			
		switch (Country) {
		case "india": {
			System.out.println("India");
			System.out.println("Enter Jno :");
			int Jno = sc.nextInt();
			int sachintons = 100;
			int virattons = 85;
			int rohittons =50;
			int mstons=16;
			 totaltons =  sachintons + virattons + rohittons + mstons ;
			switch (Jno) {
				case 10:
					//tons += 100;
				//	sachintons = 100;
					System.out.println("GOD OF CRICKET ! ");
					System.out.println("Sachin Tendulkar");
					int test_tons=51;
					System.out.println("Test tons :" + test_tons);
					int one_tons=49;
					System.out.println("one day tons :" + one_tons);
					int t20_tons=0;
					System.out.println("t20's tons :" + t20_tons);
					
					sachintons = (test_tons+one_tons+t20_tons);
					
					System.out.println("No of Tons by SACHIN : " + sachintons);
				//	totaltons =  sachintons + virattons + rohittons + mstons ;
					break;
				case 18:
					//tons +=85;
					System.out.println("King OF CRICKET !");
					int test_tonv=30;
					System.out.println("Test tons :" + test_tonv);
					int one_tonv=54;
					System.out.println("one day tons :" + one_tonv);
					int t20_tonv=1;
					System.out.println("t20's tons :" + t20_tonv);
					
					virattons =(test_tonv+one_tonv+t20_tonv);
					System.out.println("No of Tons by VIRAT : " + virattons);
					break;
				case 45:
					//tons +=50;
					System.out.println("HITMAN, Mumbai ka raja ! ");
					System.out.println("No of Tons by ROHIT : " + rohittons);
					break;
				case 7:
					//tons +=16;
					System.out.println("GREATEST CAPTAIN OF WORLD");
					System.out.println("No of Tons by MSD : " + mstons);
					break;	
				
			}
			
			
		}
		break;
		
		case "aus":{
			System.out.println("australia ");
			System.out.println("Enter Jno :");
			int Jno = sc.nextInt();
			int rickytons = 72;
			int warnertons = 49;
			int smithtons = 43;
			 totaltons= rickytons + warnertons + smithtons ;
			
				switch (Jno) {
				
				case 14:
					System.out.println("Greatest captain for australia  ");
					System.out.println("No of tons by ricky pointing :" + rickytons);
					break;
					

				case 31:
					System.out.println("Greatest player for australia  ");
					System.out.println("No of tons by warner :" + warnertons);
					break;

				case 49:
					System.out.println("Greatest test player for australia  ");
					System.out.println("No of tons by  Smith :" + smithtons);
					break;
					
				default:
					System.out.println("Enterd player was not in honer list of ICC");
				
				}
				
		
		}
		break;
		
		
		case "England":{
			System.out.println("ENGLAND");
			System.out.println("Enter Jno :");
			int Jno = sc.nextInt();
			int JoeRoottons = 72;
			int AlastairCook = 49;
			int Kevinpietersentons = 43;
			 totaltons= JoeRoottons + AlastairCook + Kevinpietersentons ;
			
				switch (Jno) {
				
				case 1:
					System.out.println("Greatest test for england  ");
					System.out.println("No of tons by Root :" + JoeRoottons);
					break;
					

				case 2:
					System.out.println("Greatest player for england  ");
					System.out.println("No of tons cook :" + AlastairCook);
					break;

				case 3:
					System.out.println("Greatest all formate player for england  ");
					System.out.println("No of tons by kevin:" + Kevinpietersentons);
					break;
				
				}
				
				System.out.println("Total no of tons by Australia players :" + totaltons);
			
		}
		break;
		
		default:
			System.out.println("You have enter invaild data");
			break;

		}
		
		
		
		
		
		sc.nextLine();
		System.out.println("Do u want tons info of all players in the honer board");
		String Toninfo= sc.nextLine();
		if (Toninfo.equalsIgnoreCase("yes")) {
		System.out.println("Total no of tons by all players :" + totaltons);
		}
		else {
		System.out.println("Have A Good Day");
		}
		
		System.out.println("Do you want to continue? (yes/no)");
		continueChoice = sc.nextLine();
		} while (continueChoice.equalsIgnoreCase("yes"));
			
		System.out.println("main method ended");
	}

}
