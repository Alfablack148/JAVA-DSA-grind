public class pattenR9 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ; i <= n ; i++){
            for(int k = i ; k < n ; k++){
                System.out.print(" ");
            }for(int j = 1 ; j <= i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
