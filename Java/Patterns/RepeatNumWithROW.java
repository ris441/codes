import java.util.Scanner;

public class RepeatNumWithROW {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n; 
        System.out.println("Enter the Number : ");
        n= Scn.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(i);
                
            }
            System.out.println();
        }
        
        
        Scn.close();
    }
    
}
