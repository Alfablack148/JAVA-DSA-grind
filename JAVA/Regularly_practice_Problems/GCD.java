package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class GCD {
    public static int findGCD(int a, int b) {
        if (b == 0)  // Base case: If b is 0, a is the GCD
            return a;
        return findGCD(b, a % b);  // Recursive call (corrected order)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}
