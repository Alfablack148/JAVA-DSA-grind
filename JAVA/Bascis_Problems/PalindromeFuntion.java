import java.util.Scanner;

public class PalindromeFuntion {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the number for check palidrome = ");
            int n =scanner.nextInt();
            palidrome(n);
        }
    }
    public static void palidrome(int n){
        int reverse = 0;
        int compare = n;
        while (n > 0) {
            reverse = (reverse * 10) + (n % 10);
            n/=10;  
        }
        if(compare == reverse){
            System.out.print(compare + " is palindrome number");
        }else{
            System.out.print(compare + " is not a palindrome number");
        }
    }
}
