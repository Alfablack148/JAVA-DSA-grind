import java.util.Scanner;

public class Half_diamond_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
        System.out.println();
        }

        for(int i = n-1 ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i]+" ");
        }
        scanner.close();
    }
}
