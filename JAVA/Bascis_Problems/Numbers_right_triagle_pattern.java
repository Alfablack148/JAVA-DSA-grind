import java.util.Scanner;

public class Numbers_right_triagle_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the N value = ");
        int n = scanner.nextInt();


        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){

             System.out.print(i+" ");
         

            }
            System.out.println();
        }
        scanner.close();
    }
}
