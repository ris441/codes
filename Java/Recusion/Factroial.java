public class Factroial
 {
    public static int fact(int n ){
        if(n==1){
            return 1; 
        }
        return n*fact(n-1);
    }
    public static int fact1(int n,int f ){
        if(n==1){
            return f; 
        }
         f *=n;

        return fact1(n-1,f);
    }
    static int ans =1;
    public static int fact1(int n){
        if(n==1){
            return ans; 
        }
         ans *=n;

        return fact1(n-1);
    }
public static void main(String[] args) {
   // int f=1; 
    int n=5;
    System.out.println(fact1(n));
}
}
