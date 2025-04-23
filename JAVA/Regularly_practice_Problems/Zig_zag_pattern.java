package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Zig_zag_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the N value = ");
        int n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++ ){
            for(int k = i ; k <= n ; k++){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++){
                if(j==1 || j==i){

                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }

            }
            for(int j = 1 ; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if(j==1 || j==i){

                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }
            } for(int j = 1 ; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if(j==1 || j==i){

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
