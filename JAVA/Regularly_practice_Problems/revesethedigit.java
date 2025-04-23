package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class revesethedigit {

    public static void main(String[] args) {
        System.out.println("enter the number = ");

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int rev = 0;
        int lastdigit = 0;
        int num2 = num1;

        while (num1 != 0) {

            lastdigit = num1 % 10;
            num1 = num1 / 10;
            rev = rev * 10 + lastdigit;
            
        }if (rev == num2) {
            System.out.print("this number palindrome ");
        }else{
        System.out.print("this number not palindrome ");
        }
   
   scanner.close();
 }
    
}
