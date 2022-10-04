import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args)
     {
        int balance = 80000;
        int withdraw;
        int deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("****Welcome to the ATM.****");
            System.out.println("Select 1 for Withdraw.");
            System.out.println("Select 2 for Deposit.");
            System.out.println("Select 3 for Check Balance.");
            System.out.println("Select 4 for Exit.");
            System.out.println("Select any one option from the 4 options. ");

            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Enter amount to be withdraw.");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("You have insufficient balance in your account.");
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Enter amount to be deposited.");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been successfully deposited.");
                    System.out.println("  ");
                    break;

                case 3:
                    System.out.println("Total balance in your account is: " + balance);
                    System.out.println("  ");

                    break;

                case 4:
                    System.out.println("Exit");
                    System.out.println("Thanks for using our services.");
                    
            }
           

        }
        
    }
    
}