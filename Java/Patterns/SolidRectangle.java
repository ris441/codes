import java.util.Scanner;

public class SolidRectangle{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the Number of Rows :");
        n = scn.nextInt();
        System.out.println("Enter the Number of Columns:");
        m=scn.nextInt();
        for (int i = 0; i <n; i++) {
             for (int j = 0; j < m; j++) {
               System.out.print("*");  
             }            
             System.out.println();
        }
        scn.close();
    }
}