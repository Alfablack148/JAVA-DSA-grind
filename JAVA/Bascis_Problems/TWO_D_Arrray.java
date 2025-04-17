import java.util.*;
public class TWO_D_Arrray {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
  
       System.out.print("enter the number of subjects = ");
       int subjects = scanner.nextInt();
       
       System.out.print("enter the number of students = ");
       int students = scanner.nextInt();

       int studentmarks[][] = new int[subjects][students];


       for(int i = 0 ; i < subjects ; i++){
         System.out.println("Subject "+(i+1)+":");
        for(int j = 0 ; j < students ; j++){
            System.out.print("student " + (j+1) + "= ");
            studentmarks[i][j] = scanner.nextInt();
        }
        System.out.println();
       }
       System.out.println("Students Marks\n");
       for(int i = 0 ; i < subjects ; i++){
        System.out.println("Subject "+(i+1)+":");
        for(int j = 0 ; j < students ; j++){
            System.out.print("student " + (j+1) + "= "+ studentmarks[i][j]);
            System.out.println();
        }
        System.out.println();
       }
}
    }
}
