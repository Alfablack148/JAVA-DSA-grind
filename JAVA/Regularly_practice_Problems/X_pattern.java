package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class X_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the N value = ");
        int n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(j==i || i+j == n+1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           
            System.out.println();
        }
        scanner.close();
    }
}
