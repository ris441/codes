import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        System.out.println("Enter the Number Of Rows :");
        n= in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        
        in.close();
    }
    
}
