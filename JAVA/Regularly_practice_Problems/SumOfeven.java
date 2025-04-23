package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class SumOfeven {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("enter the n value = ");
        int n = scanner.nextInt();

        
        int sum = 0;
       
        for(int i = 1 ; i <= n ; i++){
            sum = sum +(2*i);
        }
       
        System.out.print("Sum of  "+n+" even number = "+sum);
        scanner.close();
    }
}
