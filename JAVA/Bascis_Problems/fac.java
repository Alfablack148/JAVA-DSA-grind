import java.util.Scanner;

public class fac {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("enter the number = ");
            int n = scanner.nextInt();
            System.out.print(fact(n));
        }
    }
    public static int fact (int n){
        int ans = 1;
        for(int i = 1 ; i < n ; i++){
           ans += ((i * 2)+1);
        }
        return ans;
    }
}
