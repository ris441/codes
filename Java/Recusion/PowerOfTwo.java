public class PowerOfTwo {
    static boolean powOfTwo(int n){
        if(n==1){
            return true;
        }
       
        else if(n<2){
        return false;
        }
        return n%2==0&&powOfTwo(n/2);
    }
    public static void main(String[] args) {
        System.out.println(powOfTwo(10));
    }
}
