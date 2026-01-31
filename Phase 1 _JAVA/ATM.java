import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Jayvardhan";
        long mob = 9699898190L;
        int pin = 1234;
        int balance = 2000;

        System.out.println("Welcome to BOB Bank");
        System.out.println("Enter your 4-digit UPI PIN & do not share it with anyone.");
        System.out.print("Enter your UPI PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            char ch = 'y';
            while (ch == 'y' || ch == 'Y') {
                System.out.println("\nWelcome, it's your account.");
                System.out.println("Choose an option:");
                System.out.println("W - Withdraw");
                System.out.println("D - Deposit");
                System.out.println("B - Check Balance");

                System.out.print("Enter your choice: ");
                char key = sc.next().toUpperCase().charAt(0);

                switch (key) {
                    case 'W':
                        System.out.print("Enter withdrawal amount: ");
                        int withdraw = sc.nextInt();
                        if (withdraw > balance) {
                            System.out.println(" Insufficient bank balance.");
                        } else {
                            balance -= withdraw;
                            System.out.println(" Withdrawal successful. Amount: " + withdraw);
                            System.out.println(" Current balance: " + balance);
                        }
                        break;

                    case 'D':
                        System.out.print("Enter deposit amount: ");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println(" Deposit successful. Amount: " + deposit);
                        System.out.println(" Current balance: " + balance);
                        break;

                    case 'B':
                        System.out.println(" Your current bank balance is: " + balance);
                        break;

                    default:
                        System.out.println(" Invalid choice. Please select W, D, or B.");
                }

                System.out.print("Do you want to perform another transaction? (y/n): ");
                ch = sc.next().charAt(0);
            }
            System.out.println(" Thank you for using BOB Bank!");
        } else {
            System.out.println(" Incorrect PIN. Access denied.");
        }

        sc.close();
    }
}
