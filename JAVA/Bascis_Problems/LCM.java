import java.util.Scanner;

public class LCM {
    public static int findGCD(int a, int b) {
        if (b == 0)  
            return a;
        return findGCD(b, a % b); 
    }
    public static int findLCM(int a, int b){
        return (a * b) / findGCD(a,b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int LCM = findLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + LCM);


        scanner.close();
    }
}
