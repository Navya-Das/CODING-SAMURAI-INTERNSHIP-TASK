import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("===== Basic Calculator =====");
            
           
            System.out.print("Enter first number: ");
            double n1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double n2 = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;

            
            switch (operator) {
                case '+':
                    result = n1 + n2;
                    System.out.println("Result: " + result);
                    break;

                case '-':
                    result = n1 -2;
                    System.out.println("Result: " + result);
                    break;

                case '*':
                    result = n1 * n2;
                    System.out.println("Result: " + result);
                    break;

                case '/':
                    if (n2 != 0) {
                        result = n1 / n2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
            }

        
            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = sc.next().charAt(0);

        }
       while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}