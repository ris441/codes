import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the Number of Rows :");
        n = scn.nextInt();
        System.out.println("Enter the Number of Columns:");
        m=scn.nextInt();
        for (int i = 0; i <n; i++) {
             for (int j = 0; j < m; j++) {
                 if(i==0|| i==n-1 ||j==0||j==m-1)
               System.out.print("*");  
               else
               System.out.print(" ");
        
             }            
             System.out.println();
        }
        scn.close();
    }

    
}
