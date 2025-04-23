package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class fabonacci_funtion {
    public static void main(String[] args) {
        try(Scanner scanner  = new  Scanner(System.in)){
            System.out.print("enter the number = ");
            int n = scanner.nextInt();
            int arr[] = fabonacci(n);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }

    public static int[] fabonacci(int n){
        int[] arr = new int[n];
        
        int first = 0;
        int secound = 1;

        int i = 2;

        arr[0] = first;
        arr[1] = secound;
        
       while (i < n) {
        int temp = first;
        first = secound;
        secound = temp + secound;
        arr[i] = secound;
        i++;
       }
      return arr;
    }
}
