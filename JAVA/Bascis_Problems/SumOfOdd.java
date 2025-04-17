import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("enter the n value = ");
        int n = scanner.nextInt();

        
        int sum = 0;
       
        for(int i = 0 ; i < n ; i++){
            sum = sum +(2*i+1);
        }
       
        System.out.print("Sum of "+n+" Odd number = "+sum);
        scanner.close();
    }
}
