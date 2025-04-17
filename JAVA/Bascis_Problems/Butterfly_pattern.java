import java.util.Scanner;

public class Butterfly_pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the N value = ");
        int n = scanner.nextInt();
        
        for(int i = 1 ; i <= n ; i++ ){

            for(int j = 1 ; j <= i ; j++){

                System.out.print("*");

            }
            for(int j = 1 ; j <= 2*(n-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = n-1 ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= 2 * (n-i) ; j++ ){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    scanner.close();
    
    }
}