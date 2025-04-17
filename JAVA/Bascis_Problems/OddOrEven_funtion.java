import java.util.Scanner;

public class OddOrEven_funtion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number for check odd or even = ");
        int n = scanner.nextInt();

        OddorEven(n);
        scanner.close();
    }

    public static void OddorEven(int n){
        if(n % 2 == 0){
            System.out.print(n + " is even number");
        }else{
            System.out.print(n + " is odd number");
        }
    }
}
