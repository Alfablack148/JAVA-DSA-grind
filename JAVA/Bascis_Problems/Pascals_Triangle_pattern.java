import java.util.Scanner;

public class Pascals_Triangle_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int num = 1;
        System.out.print("enter the N value = ");
        int n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int k = i ; k <= n ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if(j==1 || j==i ){
                    System.out.print(num+" " );
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
