import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the number = ");
            int n = scanner.nextInt();
            System.out.print(numberOfDigits(n));
        }
    }
    public static int numberOfDigits(int n){
        int count = 0;
        while (n > 0) {
          count++;
            n/=10;
        }
        return count;
    }
}