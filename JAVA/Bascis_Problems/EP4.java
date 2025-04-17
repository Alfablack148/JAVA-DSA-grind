import java.util.*;

public class EP4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        long PhoneNumber;
        String Gender;

        System.out.print("enter the name = ");
        name = scanner.nextLine();
        System.out.print("enter the age = ");
        age = scanner.nextInt();
        System.out.print("enter the phone number = ");
        PhoneNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.print("enter the Gender(male/female/Other) = ");
        Gender = scanner.nextLine();
        System.out.println();

        System.out.println("Your detailes:");
        System.out.println("name         = " + name);
        System.out.println("age          = " + age);
        System.out.println("phone number = " + PhoneNumber);
        System.out.println("Gender       = " + Gender);

        scanner.close();
    } 
}
