

public class Calc {

    public static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Difference = " + (a - b));
    }

    
    public static void mul(int a, int b) {
        System.out.println("Product = " + (a * b));
    }

    public static void div(double a, double b) {
        if (b != 0) System.out.printf("Quotient = %.4f%n", (a / b));
        else System.out.println("Error: Division by 0 is not allowed.");
    }

    public static void rem(int a, int b) {
        if (b != 0) System.out.println("Remainder = " + (a % b));
        else System.out.println("Error: Division by 0 is not allowed.");
    }

    public static void sq(int a, int b) {
        System.out.println("Square of first = " + (a * a));
        System.out.println("Square of second = " + (b * b));
    }

    public static void cu(int a, int b) {
        System.out.println("Cube of first = " + (a * a * a));
        System.out.println("Cube of second = " + (b * b * b));
    }

    public static void rt(int a, int b) {
        System.out.printf("√%d = %.4f%n", a, Math.sqrt(a));
        System.out.printf("√%d = %.4f%n", b, Math.sqrt(b));
    }

    public static void pow(int a, int b) {
        System.out.printf("First^Second = %.4f%n", Math.pow(a, b));
        System.out.printf("Second^First = %.4f%n", Math.pow(b, a));
    }

    public static void cubeRoot(int a, int b) {
        System.out.printf("∛%d = %.4f%n", a, Math.cbrt(a));
        System.out.printf("∛%d = %.4f%n", b, Math.cbrt(b));
    }

    public static void exp(double a) {
        System.out.printf("e^%.2f = %.4f%n", a, Math.exp(a));
    }

    public static void trig(double a) {
        System.out.printf("sin(%.2f°) = %.4f%n", a, Math.sin(Math.toRadians(a)));
        System.out.printf("cos(%.2f°) = %.4f%n", a, Math.cos(Math.toRadians(a)));
        System.out.printf("tan(%.2f°) = %.4f%n", a, Math.tan(Math.toRadians(a)));
    }

    public static void inverseTrig(double a) {
        if (a < -1 || a > 1) {
            System.out.println("Error: Input must be in [-1, 1] for inverse trig.");
            return;
        }
        System.out.printf("asin(%.2f) = %.4f°%n", a, Math.toDegrees(Math.asin(a)));
        System.out.printf("acos(%.2f) = %.4f°%n", a, Math.toDegrees(Math.acos(a)));
        System.out.printf("atan(%.2f) = %.4f°%n", a, Math.toDegrees(Math.atan(a)));
    }

    public static void hyperTrig(double a) {
        System.out.printf("sinh(%.2f) = %.4f%n", a, Math.sinh(a));
        System.out.printf("cosh(%.2f) = %.4f%n", a, Math.cosh(a));
        System.out.printf("tanh(%.2f) = %.4f%n", a, Math.tanh(a));
    }

    public static void logs(double a) {
        if (a > 0) {
            System.out.printf("ln(%.2f) = %.4f%n", a, Math.log(a));
            System.out.printf("log10(%.2f) = %.4f%n", a, Math.log10(a));
        } else System.out.println("Error: Logarithm undefined for non-positive values.");
    }

    public static void logBase(double a, double base) {
        if (a > 0 && base > 0 && base != 1)
            System.out.printf("log base %.2f of %.2f = %.4f%n", base, a, Math.log(a) / Math.log(base));
        else
            System.out.println("Error: Base and number must be positive, base ≠ 1.");
    }

    public static void fact(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial not defined for negative numbers.");
            return;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial(" + n + ") = " + fact);
    }

    public static void rangeSum(int start, int end) {
        if (start > end) { int temp = start; start = end; end = temp; }
        int sum = 0, count = 0;
        for (int i = start; i <= end; i++) { sum += i; count++; }
        double avg = (double) sum / count;
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
        System.out.printf("Average = %.4f%n", avg);
    }


    public static void abs(int a, int b) {
        System.out.println("|a| = " + Math.abs(a));
        System.out.println("|b| = " + Math.abs(b));
    }

    public static void percentage(double a, double b) {
        System.out.printf("%.2f%% of %.2f = %.4f%n", a, b, (a / 100.0) * b);
    }

    public static void gcdLcm(int a, int b) {
        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
