package JAVA.Bascis_Problems;

import java.util.Scanner;

public class FibonacciSequence {

    public static int fabi(int n){
        if(n == 1 || n == 2){
        return 1;
        }
        return fabi(n - 1) + fabi(n - 2);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number = ");

        int n = scanner.nextInt();
                // Print the first 5 Fibonacci numbers
                for (int i = 1; i <= n; i++) {
                    System.out.print(fabi(i) + " ");
                }
      scanner.close();  

    }
}