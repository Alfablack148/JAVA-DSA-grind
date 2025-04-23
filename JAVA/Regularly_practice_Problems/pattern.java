package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter the array size = ");
            int r = scanner.nextInt();

            int arr[] = new int[r];

            for(int i = 0 ; i < r ; i++){
                    arr[i] = scanner.nextInt();
                
            }
 
          for(int i = 0 ; i < arr.length ; i++){                 
            for(int j = 0 ; j < arr.length-1 ; j++){
                if (arr[j] > arr[j+1]) {
            
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
              }
           }
           for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
           }         
        }
    }
}
