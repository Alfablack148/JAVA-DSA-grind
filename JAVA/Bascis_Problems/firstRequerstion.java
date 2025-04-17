import java.util.Scanner;

public class firstRequerstion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the n = ");
        int n = scanner.nextInt();
          first(n);
          scanner.close();
    }
    public static void first(int n){
        if(n<1){
            return;
        }
        first(n-1);
        System.out.println(n);
        
        
    }

}
