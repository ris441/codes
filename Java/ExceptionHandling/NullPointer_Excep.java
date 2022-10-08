public class NullPointer_Excep {
    public static void main(String []args){
        // this is example of null pointer exception 
        try{
            String str=null;
            System.out.println(str.length());
            System.out.println("If Exception is ocurred then statement is never executed ");

        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception is ocurred !!!");
System.out.println(e.getMessage());
        }
    }
}
