package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class oddnumbersfrom1toN {
    public static void main(String[] args) {
        System.out.print("odd numbers from 1 to N = ");

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i = 1 ; i <= N ; i++){
            if(i % 2 == 1){

                System.out.println(i);
            }
        }
        scanner.close();
      }
    }
