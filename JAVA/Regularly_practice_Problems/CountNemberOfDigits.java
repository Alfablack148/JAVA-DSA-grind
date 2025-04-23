package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class CountNemberOfDigits {

    public static void main(String[] args) {
        System.out.println("enter the number  = ");

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();

        int digits = 0;

        while(num1 != 0){
            num1= num1/10;
            ++digits;
        }
        System.out.print("number of digits = "+ digits);
   
   scanner.close();
 }
    
}
