import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        System.out.println("enter the number = ");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int fact = 1;

for(int i = 1 ; i <= num ; i++){
    fact *= i;
}
        System.out.println("answer is = " + fact);
        scanner.close();
    }
}