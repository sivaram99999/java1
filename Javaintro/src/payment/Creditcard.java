package payment;

import java.util.Scanner;

public class Creditcard implements payment {

    Scanner sc = new Scanner(System.in);
    modlepayment mp = new modlepayment();

    // Initial balance is set only once
    public Creditcard() {
        mp.setBalance(10000);
    }

    @Override
    public void makePayment() {

        System.out.println("Enter Credit Card Number:");
        String cardno = sc.next();

        System.out.println("Enter CVV Number:");
        String cvv = sc.next();

        System.out.println("Enter Amount:");
        int amount = sc.nextInt();

        mp.setAmount(amount);

        if (cardno.length() == 12 &&
            cvv.length() == 3 &&
            mp.getAmount() > 0) {

            if (mp.getAmount() <= mp.getBalance()) {

                int remainingBalance =
                        mp.getBalance() - mp.getAmount();

                mp.setBalance(remainingBalance);

                System.out.println("Payment Successful");
                System.out.println("Paid Amount: " + mp.getAmount());
                System.out.println("Remaining Balance: "
                        + mp.getBalance());

            } else {
                System.out.println("Insufficient Balance");
            }

        } else {
            System.out.println("Invalid Card Details");
        }
    }

    @Override
    public void refund() {

   //     System.out.println("\nCurrent Balance: " + mp.getBalance());

        System.out.println("Enter Credit Card Number:");
        String cardno = sc.next();

        System.out.println("Enter CVV Number:");
        String cvv = sc.next();

        System.out.println("Enter Refund Amount:");
        int Ramount = sc.nextInt();

        mp.setAmount(Ramount);

        if (cardno.length() == 12 &&
            cvv.length() == 3 &&
            mp.getAmount() > 0) {

            int remainingBalance =
                    mp.getBalance() + mp.getAmount();

            mp.setBalance(remainingBalance);

            System.out.println("Refund Successful");
            System.out.println("Refund Amount: " + mp.getAmount());
            System.out.println("Remaining Balance: "
                    + mp.getBalance());

        } else {
            System.out.println("Invalid Card Details");
        }
    }
}