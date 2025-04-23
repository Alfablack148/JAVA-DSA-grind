package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the n value = ");
        int n = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum+=i;
            i++;
        }
        System.out.print("Sum of  "+n+"Natural number = "+sum);
        scanner.close();
    }
}
