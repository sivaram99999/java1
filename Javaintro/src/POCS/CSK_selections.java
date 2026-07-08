package POCS;
import java.util.Scanner;
public class CSK_selections {
	Scanner sc = new Scanner(System.in);
	
	void display() {
		System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your city: ");
         String city1 = sc.nextLine();

        System.out.println("Myself: " + name);
        System.out.println("I am from: " + city1);
		
	}

	public static void main(String[] args) {
		CSK_selections C = new CSK_selections();
		 C.display();
		 
		
        System.out.println("Welcome to CSK Camp");
        
        
        System.out.print("Are you a Batter or Bowler? ");
        String role = C.sc.nextLine();
        
        if(role.equalsIgnoreCase("batter")){
        	System.out.println("Yes we want batter");
        	
        	System.out.println("Are you left handed or right handed ");
            String left = C.sc.nextLine();
            
            if(left.equalsIgnoreCase(left)) {
            	System.out.println("Great ");
            	
            	 System.out.println("Are opening batter ? ");
                 Boolean possition = C.sc.nextBoolean();
                 
                 if(possition) {
                	 System.out.println("Your are good choice for us");
                	 
                	 System.out.println("How many runs you scored in List-A matches ");
                     int runs = C.sc.nextInt();
                     
                     if(runs >= 5000) {
                    	 System.out.println("Nice good work");
                    	 
                    	 
                         System.out.println("Do you have any experence in ipl");
                         Boolean exp = C.sc.nextBoolean();
                         
                         if(exp) {
                             System.out.println("Having experence in ipl was graet deal");
                             
                             System.out.println("Are you ready to join the camp ");
                             Boolean join = C.sc.nextBoolean();
                             
                             if(join) {
                            	 System.out.println("You can join the camp on monday");
                                 
                             }
                             else {
                            	 System.out.println("Good for best");
                                
                             }
                         }
                         else {
                        	 
                             System.out.println("Sorry we need experence batter");
                             
                         }
                     }
                     else {
                    	 System.out.println("Sorry we need consicetent batter ");
                         
                     }
                 }
                 else {
                	 System.out.println("Sorry we are looking for openrs onlys");
                 }
            }
            else {
            	System.out.println("Sorry we need leftys only");
            }
        }
        else {
        	System.out.println("Sorry we want batter ");
        }
        
       
        
        
        
       
       
        
        
        
       
       


	}

}
