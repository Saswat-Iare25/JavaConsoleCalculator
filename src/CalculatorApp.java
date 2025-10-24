// CalculatorApp.java
// Main driver program for the calculator with continuous operation loop

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

        boolean continueCalc = true;

        while (continueCalc) {
            // Input numbers
            System.out.print("\nEnter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();

            // Display menu
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
            System.out.println("14: Absolute Value (|a| and |b|)");
            System.out.println("15: Cube Roots (∛a and ∛b)");
            System.out.println("16: Exponential (e^a)");
            System.out.println("17: Inverse Trigonometric (asin, acos, atan)");
            System.out.println("18: Hyperbolic Trigonometric (sinh, cosh, tanh)");
            System.out.println("19: Logarithm with Custom Base");
            System.out.println("20: Percentage (a% of b)");
            System.out.println("21: GCD and LCM");

            int op = sc.nextInt();

            // Perform chosen operation
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
                case 14 -> Calc.abs(a, b);
                case 15 -> Calc.cubeRoot(a, b);
                case 16 -> Calc.exp(a);
                case 17 -> Calc.inverseTrig(a);
                case 18 -> Calc.hyperTrig(a);
                case 19 -> {
                    System.out.print("Enter base for logarithm: ");
                    double base = sc.nextDouble();
                    Calc.logBase(a, base);
                }
                case 20 -> Calc.percentage(a, b);
                case 21 -> Calc.gcdLcm(a, b);
                default -> System.out.println("Invalid choice! Please enter a number between 1–21.");
            }

            // Ask if user wants to continue
            System.out.print("\nDo you want to continue? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                continueCalc = false;
                System.out.println("Thank you for using the calculator. Bye!");
            }
        }

        sc.close();
    }
}
