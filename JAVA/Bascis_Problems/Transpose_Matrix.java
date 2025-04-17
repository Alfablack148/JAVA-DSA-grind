import java.util.Scanner;

public class Transpose_Matrix {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 3;
        int clounm = 3;
        int arr[][] = new int[row][clounm];
        int arr1[][] = new int[row][clounm];

        for(int i = 0 ; i < row  ; i++){
            for(int j = 0 ; j < clounm ; j++){
                arr[i][j] = scanner.nextInt();
            }
        }System.out.println(); 
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < clounm ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < clounm ; j++){
                arr1[j][i] = arr[i][j];
            }
        
        } System.out.println();
        System.out.print("tranpons array\n");
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < clounm ; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < clounm/2 ; j++){
                int temp = arr1[i][j];
                arr1[i][j] = arr1[i][clounm-1-j];
                arr1[i][clounm-1-j] = temp;
            } 
        }

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < clounm ; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
