import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number of a = ");
        int a = scanner.nextInt();

        System.out.print("enter the number of b = ");
        int b = scanner.nextInt();

        int c = 0;

        try{
            c = a / b;
            System.out.print("Result = "+c);
        }catch(ArithmeticException e){
            System.out.print(" Cannot divide by zero");
        }

        

scanner.close();
    }
}
