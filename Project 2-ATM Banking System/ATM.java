import java.util.Scanner;

public class ATM {
    // Array to store user balances (for simplicity, 3 users)
    static double[] balances = {10000.0, 5000.0, 120000.0};
    
    // Array to store user IDs (for login simulation)
    static int[] userIds = {101, 102, 103};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple ATM");
        System.out.print("Enter your User ID: ");
        int userId = sc.nextInt();

        int userIndex = authenticate(userId);
        if (userIndex == -1) {
            System.out.println("Invalid User ID. Exiting...");
            return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(userIndex);
                    break;
                case 2:
                    deposit(userIndex, sc);
                    break;
                case 3:
                    withdraw(userIndex, sc);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }

    // Authenticate user
    public static int authenticate(int userId) {
        for (int i = 0; i < userIds.length; i++) {
            if (userIds[i] == userId) {
                return i; // Return index of the user
            }
        }
        return -1; // Invalid user
    }

    // Check balance
    public static void checkBalance(int index) {
        System.out.println("Your current balance is: Rs" + balances[index]);
    }

    // Deposit money
    public static void deposit(int index, Scanner sc) {
        System.out.print("Enter amount to deposit: Rs");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balances[index] += amount;
            System.out.println("Deposit successful. New balance: Rs" + balances[index]);
        } else {
            System.out.println("Invalid amount. Try again.");
        }
    }

    // Withdraw money
    public static void withdraw(int index, Scanner sc) {
        System.out.print("Enter amount to withdraw: Rs");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balances[index]) {
            balances[index] -= amount;
            System.out.println("Withdrawal successful. New balance: Rs" + balances[index]);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}
