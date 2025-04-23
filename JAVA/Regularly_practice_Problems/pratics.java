package JAVA.Regularly_practice_Problems;
public class pratics {
    public static void main(String[] args) {
       int n = 43;
        
            long fact = 1;  
        
            for (int i = 1; i <= n; i++) {  
                fact = fact * i;  
            }  
            System.out.print(fact);
        
            int count = 0;  
        
            while (fact > 0) {  
                long last = fact % 10;  
        
                if (last == 0) {  
                    count++;  
                }  
        
                fact /= 10;  
            }  
        
           System.out.println(count); 
        }
     
    }    

