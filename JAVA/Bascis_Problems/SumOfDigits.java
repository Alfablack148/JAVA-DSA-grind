import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("enter the number = ");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int sum  = 0;
if(num == 0){
    System.out.print("sum of digits = " + num);
   
}else{
        while (num != 0) {

            sum = sum+(num % 10);
            num = num / 10;
            
        }
        System.out.print("sum of digits = " + sum);
    }
 
    scanner.close();
}
    
}
