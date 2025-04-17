import java.util.Scanner;

public class EP1 {
    public static void main(String args[]){
        String name;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the name = ");
        name = scanner.nextLine();
        System.out.println("hello " + name + " have a good day");

        scanner.close();
    }
}
