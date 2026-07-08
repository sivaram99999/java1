package Lab;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		System.out.println("WELCOME TO ANIMAL WORLD");
		Scanner sc = new Scanner(System.in);
		String continueChoice="";
		do {
		System.out.println("Enter what type of animal do you want");
		String Animal_type =sc.nextLine();
		String animal_name ="";
	//	String continueChoice="";
	
		
		switch (Animal_type.toLowerCase()) {
		case "domestic":
			System.out.println("Domestic animals are good of pets");
			System.out.println("Enter animal name");
			 animal_name = sc.nextLine();
				switch (animal_name.toLowerCase()){
				case "dog":
					System.out.println("Dogs are family animals");
				break;
				case "cat":
					System.out.println("Cats are family animals");
				break;
				default:
					System.out.println("Invalid Domestic animal");
				}
		break;
		
		case "wild":
			System.out.println("Wild animals are not a pet animals");
			System.out.println("Enter animal name");
			 animal_name = sc.nextLine();
				switch (animal_name.toLowerCase()){
				case "lion":
					System.out.println("lion is king jungle");
				break;
				case "tiger":
					System.out.println("Tiger is national animal for us");
				break;
				
				default:
					System.out.println("Invalid wild animal");
				}
			break;
			
		default:
			System.out.println("Invalid  animal type ");
		}
		
		System.out.println("Do you want to continue? (yes/no)");
		continueChoice = sc.nextLine();

		
		}
		while (continueChoice.equalsIgnoreCase("yes"));

	}

}
