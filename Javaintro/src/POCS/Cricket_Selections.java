package POCS;

import java.util.Scanner;

public class Cricket_Selections {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to CSK Camp");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.println("Myself: " + name);
        System.out.println("I am from: " + city);

        System.out.print("Are you a Batter or Bowler? ");
        String role = sc.next();

        if (role.equalsIgnoreCase("Batter")) {

            System.out.println("Okay, ready for further process.");

            System.out.print("How many List-A runs do you have? ");
            int runs = sc.nextInt();

            System.out.print("Are you an opening batter? (yes/no): ");
            String openingBat = sc.next();

            if (openingBat.equalsIgnoreCase("yes")) {

                System.out.println("Good!");

                System.out.print("Are you a left-handed batter? (yes/no): ");
                String leftHanded = sc.next();

                if (leftHanded.equalsIgnoreCase("yes")) {

                    System.out.println("Great! We are looking for left-handed opening batters.");

                    if (runs >= 4000) {
                        System.out.println("Congratulations! You are selected for the next round.");
                    } else {
                        System.out.println("You need a little more experience. Minimum 4000 List-A runs required.");
                    }

                } else {
                    System.out.println("Sorry, we are currently looking for left-handed batters only.");
                }

            } else {
                System.out.println("Sorry, we are currently looking for opening batters.");
            }

        } else {
            System.out.println("Sorry, we are currently recruiting batters only.");
        }

        sc.close();
    }
}