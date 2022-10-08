public class Print_N_numbers {
    public static void  Printn(int n){
        if(n==0){
            return ; 
        }
        // System.out.println(n);//Print the N to 1 ;

        Printn(n-1);
        System.out.print(n);//Print the 1 to N;
    }
    public static void main(String[] args) {
   Printn(100);
    }
}
