import java.util.Scanner;

public class NumberOfAllEvenNumbers {
    public static void main(String[] args) {
        System.out.print("enter N number of even number = ");

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1 ; i <= N ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
    
}
