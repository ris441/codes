import java.util.Scanner;

public class zeroOneTri {
    public static void main(String[] args) {
        int n; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number Of Row : ");
        n=in.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int sum= i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
                
            }
            System.out.println();

        }
        
        
        in.close();
    }
}
