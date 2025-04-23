package JAVA.Regularly_practice_Problems;
public class pattenR8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n ; i >= 1 ; i--){
            for(int k = i ; k < n ; k++){
                System.out.print(" ");
            }for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
