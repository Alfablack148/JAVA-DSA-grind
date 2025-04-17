import java.util.Scanner;

public class HollowPattern_with_Diagonals {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the N value = ");
        int N = scanner.nextInt();

        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++){
                if(i==1 || i==N || j==1 || j==N || i==j || i+j == N+1){
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