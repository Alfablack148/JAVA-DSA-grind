package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class NumberFormatHandling {
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("enter the String number = ");
            String userinput = scanner.next();
            
            try {

                int num = Integer.parseInt(userinput);
                System.out.print(num + 10);

            } catch (NumberFormatException e) {

                System.out.print("enter the number string only!!");
                
            }
        }
    }
}
