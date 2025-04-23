package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class SumNnaturalNumbers {

    public static void main(String[] args) {
        System.out.println("enter the sum of N number = ");

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= N ; i++){
              sum += i;
        }
        System.out.print("Sum of N natural number = " + sum );

        scanner.close();
    }
}