import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = scanner.nextInt();

        int compare = n;
        int findcount = n;
        int count = 0;
        while (findcount != 0) {
            count++;
            findcount/=10;
        }
        int amstrong = 0;
       while (n != 0) {

        int lastDigit = n % 10;
        amstrong = amstrong + (int)(Math.pow(lastDigit, count));
        n/=10;
        
       }
       if (compare == amstrong) {
        System.out.print(amstrong+" number is Armstrong");
       }else{
        System.out.print(amstrong+" number is not armstrong");
       }
       scanner.close();
    }
}
