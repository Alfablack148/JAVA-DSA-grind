package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Armstrong {

    // Function to count the number of digits in a number
    public static int numOfDigits(int n) {
        int digits = 0;
        while (n != 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }

    // Function to check if a number is an Armstrong number
    public static void checkArmstrong(int n, int digits) {
        int lastDigit;
        int originalNum = n;
        int sum = 0;

        while (n != 0) {
            lastDigit = n % 10; // Extract last digit
            sum += Math.pow(lastDigit, digits); // Raise it to power and add to sum
            n /= 10; // Remove last digit
        }

        // Check if it's an Armstrong number
        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digits = numOfDigits(num); // Count the digits

        checkArmstrong(num, digits); // Check Armstrong condition

        scanner.close();
    }
}

