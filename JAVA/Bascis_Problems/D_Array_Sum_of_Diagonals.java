import java.util.Scanner;

public class D_Array_Sum_of_Diagonals {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the n value = ");
        int n = scanner.nextInt();

        int arr[][] = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        int sum_right_Diagonals = 0;
        int sum_left_Diagonals = 0;

        for(int i = 0 ; i < n ; i++){
           sum_right_Diagonals = sum_right_Diagonals + arr[i][i];
           sum_left_Diagonals = sum_left_Diagonals + arr[i][n-1];
        }
        System.out.println("sum of right diagonals = " + sum_right_Diagonals );
        System.out.println("sum of left diagonals = " + sum_left_Diagonals);
        scanner.close();
     }
}
