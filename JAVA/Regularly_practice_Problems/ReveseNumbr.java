package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class ReveseNumbr {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the numbers = ");
            int n = scanner.nextInt();
            System.out.print(reverse(n));
        }
    }
    public static int reverse(int n){
        int revers = 0;
        while (n > 0) {
            revers = (revers * 10) + (n % 10);
            n/=10;
        }
        return revers;
    }
}
