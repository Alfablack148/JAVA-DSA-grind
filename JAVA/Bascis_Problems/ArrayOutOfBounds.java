import java.util.Scanner;

public class ArrayOutOfBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int arr[] = {1,2,3,4,5};

        System.out.print("enter the arry index (number staring in 0)= ");
        int index = scanner.nextInt();

        try{
            System.out.print(arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.print("6th element not avalible");
        }
   scanner.close();
    }
}
