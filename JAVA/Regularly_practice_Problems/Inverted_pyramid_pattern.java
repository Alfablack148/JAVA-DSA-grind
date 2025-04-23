package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Inverted_pyramid_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        for(int i = n ; i >= 1 ; i--){
            for(int k = i ; k <= n ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
        
        scanner.close();
    }
}
