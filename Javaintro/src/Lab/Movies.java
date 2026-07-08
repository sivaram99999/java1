package Lab;
import java.util.Scanner;
public class Movies {
	
	void display() {
		System.out.println("TYPE GOLD FOR GOLD SECTION TICKETS");
		System.out.println("TYPE PREMIUM FOR PREMIUM SECTION TICKETS");
		System.out.println("TYPE SELVER FOR SILVER SECTION TICKETS");
		System.out.println("TYPE NORMAL FOR NORMAL SECTION TICKETS");
		
		
	}

	public static void main(String[] args) {
		Movies m = new Movies();
		System.out.println("WELCOME TO MOVIEZONE");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Region name ");
		String Region = sc.nextLine();
		int price=0;
		 String Movie ="";
		 String Category ="";
		 
	
		
		
		switch (Region.toLowerCase()) {
		case "hyd" :
			System.out.println("WELCOME TO HYD ");
			System.out.println("Enter movie name :");
			 Movie = sc.nextLine();
			
				switch (Movie.toLowerCase()) {
					case "rrr" :
						System.out.println("WELCOME TO RRR WORLD");
						m.display();
						Category = sc.nextLine();
				//	int price=0;
							switch (Category.toLowerCase()) {
								case "gold" :
									price =450;
									System.out.println("Price of gold : 450");
					
									break;
								case "premium":
									price =350;
									System.out.println("Price of Premium is 350");
									break;
								case "silver":
									price = 250;
									System.out.println("Price of Silver is 250");
									break;
								case "normal":
									price = 100;
									System.out.println("Price of Normal is 100");
									break;
				 		
					
								default :
									System.out.println("Invaild Category !");
									return;
							}
							break;
					
				
				
			//	default:
			//		System.out.println("Invalid movie");
			//		return;
			//		
					case "og":
						System.out.println("POWER STAR'S OG ");
						m.display();
						Category = sc.nextLine();
							switch (Category.toLowerCase()) {
								case "gold" :
									price =550;
									System.out.println("Price of gold : 550");
					
									break;
								case "premium":
									price =450;
									System.out.println("Price of Premium is 450");
									break;
								case "silver":
									price = 250;
									System.out.println("Price of Silver is 250");
									break;
								case "normal":
									price = 100;
									System.out.println("Price of Normal is 100");
									break;
				 		
					
								default :
									System.out.println("Invaild Category !");
									return;
							}
							break;
					case "peddi":
						System.out.println("Malli pudathava enti?");
						m.display();
						Category = sc.nextLine();
						switch (Category.toLowerCase()) {
						case "gold" :
							price =400;
							System.out.println("Price of gold : 400");
			
							break;
						case "premium":
							price =300;
							System.out.println("Price of Premium is 300");
							break;
						case "silver":
							price = 200;
							System.out.println("Price of Silver is 200");
							break;
						case "normal":
							price = 100;
							System.out.println("Price of Normal is 100");
							break;
		 		
			
						default :
							System.out.println("Invaild Category !");
							return;
					}
					break;
					
					
				
				default:
					System.out.println("Invalid movie");
					return;
					
				}
					break;
				
		case"vij":
			System.out.println("WELCOME TO ROYAL VIJAYAWAD");
			System.out.println("Enter movie name ");
			Movie = sc.nextLine();
				switch (Movie.toLowerCase()) {
				case "og":
					System.out.println("POWER STAR'S OG ");
					m.display();
					
					Category = sc.nextLine();
					switch (Category.toLowerCase()) {
						case "gold" :
							price =350;
							System.out.println("Price of gold : 350");
			
							break;
						case "premium":
							price =250;
							System.out.println("Price of Premium is 250");
							break;
						case "silver":
							price = 150;
							System.out.println("Price of Silver is 150");
							break;
						case "normal":
							price = 100;
							System.out.println("Price of Normal is 100");
							break;
		 		
			
						default :
							System.out.println("Invaild Category !");
							return;
					}
					break;
					
				case "gunturkaram":
					System.out.println("Aadu chudantanike garuku... manasu matram cheruku!");
					m.display();
					Category = sc.nextLine();
					switch (Category.toLowerCase()) {
						case "gold" :
							price =250;
							System.out.println("Price of gold : 250");
			
							break;
						case "premium":
							price =200;
							System.out.println("Price of Premium is 200");
							break;
						case "silver":
							price = 150;
							System.out.println("Price of Silver is 150");
							break;
						case "normal":
							price = 100;
							System.out.println("Price of Normal is 100");
							break;
		 		
			
						default :
							System.out.println("Invaild Category !");
							return;
					}
					break;
					
					
				default :
					System.out.println("Invaild movie !");
					return;

				}
			break;
				
		
		default:
			System.out.println("Invalid region ");
			return;
	
		}
		
		
		System.out.println("How many tickets do you want :");
		int tickets = sc.nextInt();
		
		int total = price *tickets;
		 System.out.println("=================================");
         System.out.println("Movie Name      :" + Movie);
         System.out.println("Ticket Category : " + Category);
         System.out.println("Ticket Price    : " + price);
         System.out.println("No of Tickets   : " + tickets);
         System.out.println("Total Price     : " + total);
         System.out.println("=================================");
		
	}

}
