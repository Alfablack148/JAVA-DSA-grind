import java.util.Scanner;

public class sumOfPrimeNumbers {

    public static boolean sumofprime(int N) {
       

        if (N <= 1) {
            return false; // No need to assign to isprime, just return
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    return false; // If divisible, not prime
                }
            }
        }
        return true; // If no divisors found, it’s prime
    }

    public static void main(String[] args) {
        System.out.print("Enter the upper limit to sum prime numbers up to: ");
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0; // Initialize sum outside loop

        for (int i = 2; i <= N; i++) {
            if (sumofprime(i)) {
                sum += i; // Add prime number to sum
            }
        }
        System.out.println("Sum of prime numbers = " + sum);
        
        scanner.close(); // Good practice to close scanner
    }
}