import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clear_Ith_bit {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int n , i ;
    
        System.out.printf("Enter the number : %n");         
    
        n= Integer.parseInt(bfr.readLine());
        System.out.printf("Enter the i th bit : %n");
        i=Integer.parseInt(bfr.readLine());
        // 5 = 101  mask = ~(1<<i)=011 , 
        //(101)&(011)=001 is ans 
        int mask = ~(1<<i);
        int ans = n&mask;
        System.out.println("After the clearing i th bit number is "+ ans );
    

    }


}
