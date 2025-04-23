package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class SumOfDigits_funtion {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the number = ");
            int n = scanner.nextInt();
            System.out.print(sumOfDigit(n));
        }
    }
    public static int sumOfDigit(int n ){
        int sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n/=10;
        }
        return sum;
    }
}
