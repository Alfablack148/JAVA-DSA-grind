package JAVA.Regularly_practice_Problems;
import java.util.*;
public class EP2 {
    public static void main(String args[]){
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the age = ");
        age = scanner.nextInt();

        if( age >= 18){
            System.out.println("your eligiple to enter rollergoster ride");
        }else{
            System.out.println("your not eligiple to enter rollergoster ride");
        }
        scanner.close();
        }
        
    }

