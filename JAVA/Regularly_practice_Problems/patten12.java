package JAVA.Regularly_practice_Problems;
public class patten12 {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            for(int k = i ; k <= 5 ; k++ ){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if((i == 1) || (i == 2) || (j == 1) || (j == i)){
          
                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }
              
            }

            System.out.println();
        }for(int i = 5 ; i >= 1 ; i--){
            for(int k = i ; k <= 5 ; k++ ){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                if((i == 1) || (i == 2) || (j == 1) || (j == i)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
      System.out.println();
        }
    }
}