package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Inverted_right_angle_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create the scanner object

        System.out.print("enter the number = "); 
        int n = scanner.nextInt();

        //outer loop for rows
        for(int i = n ; i >= 1 ; i--){
            //inner loop for cloumns
            for(int j = 0 ; j < i ; j++){
                System.out.print("* "); // print star with space
            }
            System.out.println();//move next line for each row
        }
        scanner.close();// close the scanner to prevent resource leaks
    }
}
