import java.util.Scanner;

public class InvHalfPyrawithNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n; 
        System.out.println("Enter the Number of Rows : ");
        n=in.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <=n- i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        
        in.close();
    }
}
