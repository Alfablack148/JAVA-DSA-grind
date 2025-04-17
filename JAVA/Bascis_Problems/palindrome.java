import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the the number = ");
        int n = scanner.nextInt();


        int compare = n;
        int rev = 0;
        while (n != 0) {
            rev = (rev*10)+(n%10);
            n/=10;
        }
        if (compare == rev) {
            System.out.print(rev+" this number is palindrome");
        }else{
            System.out.print(rev+" this number is not palindrome");
        }
        scanner.close();
    }
}
