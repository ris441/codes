public class ButterflyPattern{

    public static void upperhalfPyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    public static void lowerhalf(int n ){
   for ( int i = n; i>=1 ; i --){
    
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    public static void main(String[] args) {
        lowerhalf(2);
        upperhalfPyramid(2);
       
        
    }
}