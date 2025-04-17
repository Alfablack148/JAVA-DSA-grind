import java.util.Scanner;

public class Hourglass_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the N value = ");
        int n = scanner.nextInt();

        for(int i = n ; i >= 1 ; i--){
            for(int k = i ; k <= n ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 2 ; i <= n ; i++){
            for(int k = i ; k < n ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        scanner.close();
    }
}
