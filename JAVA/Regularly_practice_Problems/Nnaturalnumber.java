package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Nnaturalnumber {
    public static void main(String[] args) {
        System.out.print("enter n number = ");

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1 ; i <= N ;i++){
            System.out.println(i);
        }
        scanner.close();
    }
    
}
