package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class amstrong {

    public static int NumOfDigite(int n){
        int digite = 0;
        while (n != 0) {

            n/=10;
            digite++;
            
        }return digite;
    } 

    public static void  checkAmstrong(int n , int digite){
      int lastdigite = 0;
      int comparenum = n;
      int sum = 0;
        while (n != 0) {

            lastdigite = n % 10;
            sum += Math.pow(lastdigite,digite);
            n = n / 10 ; 
            
        }

                if (comparenum == sum) {

            System.out.println("this number is amstrong");
            
        }else{
            System.out.println("this not amstrong number");
        }
    }
    public static void main(String[] args) {
        System.out.println(" enter the number = ");

        Scanner scanner = new Scanner(System.in);
    
        int num1 = scanner.nextInt();
int digi = NumOfDigite(num1);

checkAmstrong(num1,digi);

scanner.close();


    }
}
