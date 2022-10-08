import java.util.Scanner;

public class NestedTryBlock {
    public static void main (String []args){

    // outer (main block ) of try block
    try{
        // inner block 1 
        Scanner in = new Scanner(System.in);
        try {
            // inner block 2 
            try {
                int a;
            System.out.println("Enter the value of Numenerator :");
            a= in.nextInt();
            System.out.println("Enter the value of Denominator : ");
            int b= in.nextInt();
            int ans = a/b;
            System.out.println("ans = "+ ans );
in.close();
            } catch (NullPointerException in_e2) {
                //TODO: handle exception
                System.out.println("Null Pointer Exception is ocurred !!! ");
                System.out.println(in_e2.getMessage());
            }
            
        } catch (ArithmeticException in_e1) {
            //TODO: handle exception
            System.out.println("Arithmetic Exception is Ocurred !!!");
            System.out.println(in_e1.getMessage());
        }

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of bound exception is ocurred !!!");
        System.out.println(e);
    }
    // catch(Exception o_e){
    //     System.out.println("Exception is Handled ");
      
    // }
finally{
    System.out.println("This is finally block always executed ");
}
    }
}
