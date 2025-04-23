package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class two_D_Array_Rotate_by_90_Degrees {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the number n = ");
            int n = scanner.nextInt();
    
           int arr[][] = new int[n][n];
    
           for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[j][i] = scanner.nextInt();
            }
           }System.out.println("Transpose");
           for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
           }

           for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n/2 ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
           }System.out.println("Array Rotate by 90 Degrees");
           for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
           }

        }
    }
}
