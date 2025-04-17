import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        int sum = 0;
        while (n != 0) {
            sum = sum + (n%10);
            n/=10;
        }
        System.out.print("sum of digits = "+sum);
        scanner.close();
    }
}
