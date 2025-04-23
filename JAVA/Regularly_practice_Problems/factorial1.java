package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class factorial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        int fact = 1;
        while (n != 0) {
            fact = fact * (n%10);
            n/=10;
        }
        System.out.print("Factorial = "+fact);
        scanner.close();
    }
}
