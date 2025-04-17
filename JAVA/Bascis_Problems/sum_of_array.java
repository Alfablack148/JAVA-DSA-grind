import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the row = ");
        int row = scanner.nextInt();

        System.out.print("enter the clounm = ");
        int clounm = scanner.nextInt();


        int arr1[][] = new int[row][clounm];
       

        int rightcoress = 0;
        
      

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < clounm ; j++){

             arr1[i][j] = scanner.nextInt();

            }
        }

        for(int i = 0 ; i < row ; i++){
       for(int j = 0 ; j < clounm ; j++ ){
      rightcoress +=arr1[i][j];
       }

        }
        System.out.println(rightcoress);

        scanner.close();
    }
}
