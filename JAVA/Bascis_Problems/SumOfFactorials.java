import java.util.Scanner;

public class SumOfFactorials {

    public static void main(String[] args) {
        System.out.print("enter the number = ");

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int fact = 1;
        int SumOfFactorial = 0;

        for(int i = 1 ; i <= N ; i++){

            fact*=i;
            SumOfFactorial+=fact;
        }
        System.out.println("sum of fsctorial = " + SumOfFactorial);
        scanner.close();
    }
}