package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class CheckprimeNumber {
    public static void main(String[] args) {
        System.out.print("enter the number = ");

        Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();

            boolean isprime = true; // checking prime or not prime 

            if(N <= 1){

                isprime = false;

            }else{
                for(int i = 2 ; i <= Math.sqrt(N) ; i++ ){

                if(N % i == 0){
                    isprime = false;
                    break;
                }
            }

         } if(isprime == true){

            System.out.print(" this number is prime = "+ N);

        }else{
            System.out.print(" this number is Not prime = "+ N);
        }

    scanner.close();
      }
    }

