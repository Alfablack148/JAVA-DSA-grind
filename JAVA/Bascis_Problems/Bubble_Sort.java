import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)){
        System.out.print("enter the array size = ");
        int n = scanner.nextInt();
        int[] arr  = new int[n];
        boolean elamentSwapped = true;

        for(int i = 0 ; i < arr.length ; i++ ){
            arr[i] = scanner.nextInt();
        }

        while(elamentSwapped == true){
            elamentSwapped = false;
            for(int j = 0 ; j < arr.length-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    elamentSwapped = true;
                }
            }
        }
System.out.println("\nBubble sort :\n");
        for(int i = 0 ; i < arr.length ; i++ ){
           System.out.println(i+" = "+arr[i]);
        }

       }

    }
    
}
