package JAVA.Regularly_practice_Problems;
public class name {
    public static void main(String[] args) {
        int n = 50;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
               System.out.print("* ");
            }
            System.out.println();
        } for(int i = n-1 ; i >= 1 ; i--){
            for(int j = 1 ; j <= i ; j++){
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}
