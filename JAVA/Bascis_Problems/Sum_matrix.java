import java.util.*;

public class Sum_matrix {
    public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);

      System.out.print("enter the number = ");
      int n = Scanner.nextInt();

      int arr[][] = new int[n][n];



      for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
            arr[i][j] = Scanner.nextInt();
        }
      }
      int sum = 0;

      for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n ; j++){
           sum+=arr[i][j];
        }
      }

      System.out.println("sum of matrix = "+sum);
      
       
     
      
       Scanner.close(); 
        
    }
}
