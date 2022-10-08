import java.util.Scanner;

public class Arith_Exception{


    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        try {
            
            int a;
            System.out.println("Enter the value of Numenerator :");
            a= in.nextInt();
            System.out.println("Enter the value of Denominator : ");
            int b= in.nextInt();
            int ans = a/b;
            System.out.println("ans = "+ ans );
in.close();
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("Arithmetic Exception is ocurred !!!");
           System.out.println( e.getMessage());
            
        }
        
    }
}