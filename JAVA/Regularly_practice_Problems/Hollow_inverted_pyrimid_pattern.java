package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Hollow_inverted_pyrimid_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        for(int i = n ; i >= 1 ; i--){
            for(int k = i ; k < n ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if(j==1 || j==i || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    } 
}
