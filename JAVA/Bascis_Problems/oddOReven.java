import java.util.Scanner;

public class oddOReven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        if(n % 2 == 0){
            System.out.print(n+" number is even");
        }else{
            System.out.print(n+" number is odd");
        }

        scanner.close();
    }
}
