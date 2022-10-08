import java.util.Scanner;

public class InverHfPymid180deg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n; 
        System.out.println("Enter the Number of Rows : ");
        n=in.nextInt();
        for (int i = 1; i <=n; i++) {
             for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i+1; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        
        in.close();
    }
}
