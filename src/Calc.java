// Calc.java
// Contains all calculator operations as static methods

public class Calc {

    // Addition
    public static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Subtraction
    public static void sub(int a, int b) {
        System.out.println("Difference = " + (a - b));
    }

    // Multiplication
    public static void mul(int a, int b) {
        System.out.println("Product = " + (a * b));
    }

    // Division
    public static void div(double a, double b) {
        if (b != 0) {
            System.out.printf("Quotient = %.4f%n", (a / b));
        } else {
            System.out.println("Error: Division by 0 is not allowed.");
        }
    }

    // Remainder
    public static void rem(int a, int b) {
        if (b != 0) {
            System.out.println("Remainder = " + (a % b));
        } else {
            System.out.println("Error: Division by 0 is not allowed.");
        }
    }

    // Squaring
    public static void sq(int a, int b) {
        System.out.println("Square of first = " + (a * a));
        System.out.println("Square of second = " + (b * b));
    }

    // Cubing
    public static void cu(int a, int b) {
        System.out.println("Cube of first = " + (a * a * a));
        System.out.println("Cube of second = " + (b * b * b));
    }

    // Square roots
    public static void rt(int a, int b) {
        System.out.printf("Square root of first = %.4f%n", Math.sqrt(a));
        System.out.printf("Square root of second = %.4f%n", Math.sqrt(b));
    }

    // Powers
    public static void pow(int a, int b) {
        System.out.printf("First^Second = %.4f%n", Math.pow(a, b));
        System.out.printf("Second^First = %.4f%n", Math.pow(b, a));
    }

    // Trigonometric functions
    public static void trig(double a) {
        System.out.printf("Sine(%.2f°) = %.4f%n", a, Math.sin(Math.toRadians(a)));
        System.out.printf("Cosine(%.2f°) = %.4f%n", a, Math.cos(Math.toRadians(a)));
        System.out.printf("Tangent(%.2f°) = %.4f%n", a, Math.tan(Math.toRadians(a)));
    }

    // Logarithmic functions
    public static void logs(double a) {
        if (a > 0) {
            System.out.printf("Natural log (ln) = %.4f%n", Math.log(a));
            System.out.printf("Log base 10 = %.4f%n", Math.log10(a));
        } else {
            System.out.println("Error: Logarithm undefined for non-positive values.");
        }
    }

    // Factorial
    public static void fact(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial not defined for negative numbers.");
            return;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial(" + n + ") = " + fact);
    }

    // Range sum and average
    public static void rangeSum(int start, int end) {
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int sum = 0, count = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            count++;
        }
        double avg = (double) sum / count;
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
        System.out.printf("Average = %.4f%n", avg);
    }
}
