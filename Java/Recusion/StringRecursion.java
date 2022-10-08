import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringRecursion {
    public static String Printstrng(int n , String str ){
        if ( n==1){
            return str ;
        }
        
        //System.out.println(str);
       // Printstrng(n-1, str);
        return str+"\n"+Printstrng(n-1, str);
    }
public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    System.out.println("How Many Times String is print ??");
    int n=in.nextInt();
    System.out.print( "Enter The String :");
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    String str = bfr.readLine();
if(n!=0)
    System.out.println(Printstrng(n, str));
    
    in.close();
}
}
