package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class AmstrongNumber_funtion {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the number = ");
            int n = scanner.nextInt();
            amstrong(n);

        }
    }
    public static void amstrong(int n){
        int digit = 0;
        int ans = 0;
        int compare = n;
        while (n > 0) {
            digit = n % 10;
            ans += (int)(Math.pow(digit,3));
            n/=10;
        }
        if (compare == ans) {
            System.out.print(compare + " is amstrong number ");
        }else{
            System.out.print(compare + " is not amstrong number ");
        }
    }
}
