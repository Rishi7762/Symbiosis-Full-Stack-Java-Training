package demo;
import java.util.Scanner;

public class MathematicsMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-----Basic Mathematical Calculations Menu-----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int add1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int add2 = sc.nextInt();
                    System.out.println("Result: " + (add1 + add2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    int sub1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int sub2 = sc.nextInt();
                    System.out.println("Result: " + (sub1 - sub2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    int mul1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int mul2 = sc.nextInt();
                    System.out.println("Result: " + (mul1 * mul2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int div1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int div2 = sc.nextInt();
                    if (div2 != 0) {
                        System.out.println("Result: " + (div1 / div2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    int mod1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int mod2 = sc.nextInt();
                    if (mod2 != 0) {
                        System.out.println("Result: " + (mod1 % mod2));
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                    }
                    break;

                case 6:
                    System.out.println("Exited the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }

            System.out.println();
        } while (choice != 6);
    }
}
