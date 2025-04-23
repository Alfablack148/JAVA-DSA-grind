package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class factOfDidit_funtion {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the number = ");
            int n = scanner.nextInt();
            System.out.print(fact(n));
        }
    }
    public static int fact(int n){
        int factorial = 1;
        while (n > 0) {
            factorial = factorial * (n % 10);
            n/=10;
        }
        return factorial;
    }
}
