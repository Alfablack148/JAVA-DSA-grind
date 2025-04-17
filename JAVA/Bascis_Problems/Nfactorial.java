import java.util.Scanner;

public class Nfactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the n value = ");
        int n = scanner.nextInt();

        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
            
        }
        System.out.print(n+" factorial = "+fact);
        scanner.close();
    }
}
