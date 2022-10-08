public class Multiple_Catch_block {
    public static void main(String [] args){
        
        try{
        
        int a[]={3,5,543,49,9};
        System.out.println("a[10] = "+ a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is ocurred !!!!");
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("NUmber Format Exception is ocurred !!!");
            System.out.println(e.getMessage());
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception is Ocurred !!!");
            System.out.println(e.getMessage());
        }
        

}
}
