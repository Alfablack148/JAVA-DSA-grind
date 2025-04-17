import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        int count = 0;
        while (n != 0) {
            count++;
            n/=10;
        }
        System.out.print("digits counts = "+count);
        scanner.close();
    }
}
