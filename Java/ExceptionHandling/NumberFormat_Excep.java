public class NumberFormat_Excep {
    
    public static void main(String []args){
        try {
            String s = "aba";
            int i= Integer.parseInt(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Number format Exception");
            System.out.println(e.getMessage());
        }
    }

}
