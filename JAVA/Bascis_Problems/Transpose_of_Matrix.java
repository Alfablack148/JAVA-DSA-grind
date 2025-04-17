import java.util.Scanner;

public class Transpose_of_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number n = ");
        int n = scanner.nextInt();

       int arr[][] = new int[n][n];

       for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            arr[j][i] = scanner.nextInt();
        }
       }
       for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
       scanner.close();
    }
}
