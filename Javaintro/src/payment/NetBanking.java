package payment;

import java.util.Scanner;

public class NetBanking implements payment {

    Scanner sc = new Scanner(System.in);
    modlepayment mp = new modlepayment();

    public NetBanking() {
        mp.setBalance(10000);
    }

    @Override
    public void makePayment() {

        System.out.println("Enter Account Number:");
        String accountNo = sc.next();

        System.out.println("Enter Password:");
        String password = sc.next();

        System.out.println("Enter Amount:");
        int amount = sc.nextInt();

        mp.setAmount(amount);

        if (accountNo.length() == 12 &&
            password.length() >= 6 &&
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
            System.out.println("Invalid Net Banking Details");
        }
    }

    @Override
    public void refund() {

        System.out.println("\nCurrent Balance: " + mp.getBalance());

        System.out.println("Enter Account Number:");
        String accountNo = sc.next();

        System.out.println("Enter Password:");
        String password = sc.next();

        System.out.println("Enter Refund Amount:");
        int Ramount = sc.nextInt();

        mp.setAmount(Ramount);

        if (accountNo.length() == 12 &&
            password.length() >= 6 &&
            mp.getAmount() > 0) {

            int remainingBalance =
                    mp.getBalance() + mp.getAmount();

            mp.setBalance(remainingBalance);

            System.out.println("Refund Successful");
            System.out.println("Refund Amount: " + mp.getAmount());
            System.out.println("Remaining Balance: "
                    + mp.getBalance());

        } else {
            System.out.println("Invalid Net Banking Details");
        }
    }
}