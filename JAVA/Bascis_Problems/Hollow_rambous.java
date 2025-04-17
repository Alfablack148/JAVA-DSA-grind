import java.util.Scanner;

public class Hollow_rambous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int arr[] = {1,2,3,4,5,6};

        System.out.print("enter the d value = ");
        int d = scanner.nextInt();
    



        for(int i = 1 ; i <= d ; i++){
            int temp = arr[0];
           for(int j = 0 ; j < arr.length-1 ; j++){
            arr[j] = arr[j+1];
           }
           arr[arr.length-1]=temp;
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+",");
        }
     scanner.close();
    }
}
