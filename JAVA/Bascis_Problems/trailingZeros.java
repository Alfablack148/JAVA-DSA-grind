import java.util.Scanner;

public class trailingZeros {

    static int trailingZero(int n){
        int res = 0;
        int PowOf5 = 5;

        while (n >= PowOf5) {

            res = res + (n / PowOf5);
            PowOf5 *= 5;

        }
        return res;
    }
    public static void main(String[] args) {

        System.out.print("enter the N number = ");

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.print("  trailing Zero is " + trailingZero(N));

   scanner.close();
    }
}
