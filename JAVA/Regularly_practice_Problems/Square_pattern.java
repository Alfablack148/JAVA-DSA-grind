package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Square_pattern {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
