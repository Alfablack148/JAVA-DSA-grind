import java.util.Scanner;

public class Right_Angle_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object

        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        //Outer lopp for rows
        for(int i = 0 ; i < n ; i++){
            // Inner loop for columns ( printing star)
            for(int j = 0 ;  j <= i ; j++){
                System.out.print("* "); // print star with space
            }
            System.out.println(); // move next line after each row
        }
        scanner.close();// Close the scanner to prevent resource leaks
    }
}
