package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = scanner.nextInt();
        
        int rev = 0;
        while (n != 0) {
            rev = (rev*10)+(n%10);
            n/=10;
        }
        System.out.print("reverse = "+rev);
        scanner.close();
    }
}
