import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num2;
        int num1;

        try{
            System.out.print("enter the number 1 = ");
         num1 = scanner.nextInt();

        System.out.print("enter the number 2 = ");
         num2 = scanner.nextInt();

         System.out.print(num1+num2);

           }catch(InputMismatchException e){

         System.out.print("its not a Integer");

        }
scanner.close();
    }
}
