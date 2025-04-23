package JAVA.Regularly_practice_Problems;
import java.util.Scanner;

public class Inpout {
    public static void main(String args[]) {
    
Scanner scanner = new Scanner(System.in);
int X = scanner.nextInt();
int Y = scanner.nextInt();

boolean ans1 = true;
boolean ans2 = false;
int res = 1;
if(X <= 1){
  System.out.println(ans2);
}else{
for(int i = 1 ; i <= res ; i++){
 res = (int)(Math.pow(X,i));
}if(res == Y){
 System.out.println(ans1);
}else{
 System.out.println(ans2);
}
}

scanner.close();
}
}
