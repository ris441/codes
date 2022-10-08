import java.util.Scanner;

public class SquareofNumber {
    public static void square(int n, int x ){
        int squ = 1; 
        
        for (int i = 0; i < x; i++) {
            squ*=n; 
        }
        System.out.printf("%d to the power %d is %d .",n,x,squ);
    }
    public static void main(String[] args) {
        System.out.println("Enter the numer : ");
        Scanner in = new Scanner( System.in ); 
        int n= in.nextInt();
        System.out.println("Enter the power of Number : ");
        int x= in.nextInt();
        square(n, x);
        
        in.close();
    }
}
