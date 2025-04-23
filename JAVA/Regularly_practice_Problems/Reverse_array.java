package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the array size = ");
        int n = scanner.nextInt();

        int arr[][] = new int[n][n];
        int arr1[][] = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = scanner.nextInt();
            }
        }System.out.println("Original array\n");
         for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < n; j++) {  
                arr1[i][j] = arr[n - 1 - i][n - 1 - j];
            }
        }
        

        System.out.println("reverse array\n");
         for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

scanner.close();
        
    }
}
