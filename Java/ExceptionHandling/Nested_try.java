import java.util.Scanner;

public class Nested_try {
    public static void main(String [] args){
        try {
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
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is ocurred !!!!");
            System.out.println(e.getMessage());
        }


       try { String str = "abc ";
       int i = Integer.parseInt(str);
       System.out.println("After convertion String to Integer "+i);
        }
       catch(NumberFormatException e){
        System.out.println("NUmber Format Exception is ocurred !!!");
        System.out.println(e.getMessage());
        
    }
       
        try{
        
        int arr[]={3,5,543,49,9};
        System.out.println("a[10] = "+ arr[10]);
        }  catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception is Ocurred !!!");
            System.out.println(e.getMessage());
        }
       

    }
    // catch(Exception e1){
    //     System.out.println("Exception is handled £££");

    // }
        finally{
            System.out.println("This code is always executed because this is in the finally block ");
        }


    
        

}
}
