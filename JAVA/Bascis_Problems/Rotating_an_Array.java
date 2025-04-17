import java.util.Scanner;

public class Rotating_an_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the array size = ");
        int arraySize = scanner.nextInt();
        int arr[] = new int[arraySize]; 

        // Input array elements
        System.out.println("Enter " + arraySize + " elements:");
        for (int i = 0; i < arr.length; i++) {   
            arr[i] = scanner.nextInt();
        }

        // Get the number of rotations
        System.out.print("How many times to rotate = ");
        int R = scanner.nextInt();

        //  rotation R times
        for (int i = 0; i < R; i++) {
            int temp = arr[0]; 
            for (int j = 0; j < arraySize - 1; j++) {
                arr[j] = arr[j + 1]; 
            }
            arr[arraySize - 1] = temp; // Move first element to last position
        }

        // Print rotated array
        System.out.print("Rotated array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
