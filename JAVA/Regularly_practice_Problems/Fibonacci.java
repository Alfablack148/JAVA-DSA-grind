package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Fibonacci  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        int firstterm = 0;
        int secoundterm = 1;

        System.out.print(firstterm+" ");
        System.out.print(secoundterm+" ");

        for(int i = 1 ; i <= n-2 ; i++){
            int thirdterm = firstterm + secoundterm;
            firstterm = secoundterm;
            secoundterm = thirdterm;
            System.out.print(thirdterm+" ");
        }
        scanner.close();
    }
}
