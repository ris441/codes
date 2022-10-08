import java.util.Scanner;

public class OddEven {
    public static boolean isOdd(int n){
        
        if((n & 1) == 0)
        
        return false;
        else 
        return true;

    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner( System.in); 

        int n ;
        n=in.nextInt();
      
      System.out.println(isOdd(n) == true ? "Odd" : "Even");
        in.close();

    }
}
