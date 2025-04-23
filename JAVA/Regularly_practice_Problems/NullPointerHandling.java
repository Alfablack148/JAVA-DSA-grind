package JAVA.Regularly_practice_Problems;
public class NullPointerHandling {
    @SuppressWarnings("null")
   public static void main(String[] args) {
        
     String name = null;

     try {
        System.out.print("String length = "+name.length());
     } catch (NullPointerException e) {
        System.out.print("no value for name");
     }

    }
}
