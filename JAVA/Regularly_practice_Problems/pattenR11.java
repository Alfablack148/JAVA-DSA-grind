package JAVA.Regularly_practice_Problems;
public class pattenR11 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            for(int k = i ; k <= n ; k++){
                System.out.print(" ");
            }
          for(int j = 1 ; j <= i ; j++){
            if(j==1 || j==i){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
          }
          System.out.println();
        }

        for(int i = n ; i >= 1 ; i--){
            for(int k = n ; k >= i ; k--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
