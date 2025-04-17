import java.util.Scanner;

public class method {
    public static boolean Numberoftwodigit(int n){
      int digit = 0;
        while (n != 0) {

            n = n/10;
            digit++;
            
        }if (digit == 2) {

            return true;
            
        }else {

            return false;

        }
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the nuumber = ");
        int n = scanner.nextInt();

        boolean nu = Numberoftwodigit(n);

        System.out.println(nu);

        scanner.close();
    }
}
        