// CalculatorApp.java
// Main driver program for the calculator

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        // Optional: Show factorials upfront
        System.out.print("Do you want to see factorials for both numbers? (y/n): ");
        char showFact = sc.next().charAt(0);

        if (showFact == 'y' || showFact == 'Y') {
            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();
            Calc.fact(a);
            Calc.fact(b);
        }

        while (true) {
            // Input numbers
            System.out.print("\nEnter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();

            // Menu
            System.out.println("\nChoose operation:");
            System.out.println("1: Addition (+)");
            System.out.println("2: Subtraction (-)");
            System.out.println("3: Multiplication (*)");
            System.out.println("4: Division (/)");
            System.out.println("5: Remainder (%)");
            System.out.println("6: Squares");
            System.out.println("7: Cubes");
            System.out.println("8: Square Roots");
            System.out.println("9: Powers (a^b and b^a)");
            System.out.println("10: Trigonometry (sin, cos, tan of first number)");
            System.out.println("11: Logarithms (ln, log10 of first number)");
            System.out.println("12: Factorial (of first number)");
            System.out.println("13: Range Sum & Average between first and second numbers");

            int op = sc.nextInt();

            switch (op) {
                case 1 -> Calc.add(a, b);
                case 2 -> Calc.sub(a, b);
                case 3 -> Calc.mul(a, b);
                case 4 -> Calc.div(a, b);
                case 5 -> Calc.rem(a, b);
                case 6 -> Calc.sq(a, b);
                case 7 -> Calc.cu(a, b);
                case 8 -> Calc.rt(a, b);
                case 9 -> Calc.pow(a, b);
                case 10 -> Calc.trig(a);
                case 11 -> Calc.logs(a);
                case 12 -> Calc.fact(a);
                case 13 -> Calc.rangeSum(a, b);
                default -> System.out.println("Invalid choice! Please enter 1–13.");
            }

            // Continue?
            System.out.print("\nDo you want to continue? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                System.out.println("Bye!");
                break;
            }
        }
        sc.close();
    }
}
