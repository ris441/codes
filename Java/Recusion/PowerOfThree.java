public class PowerOfThree {
    public  static boolean isPowerOfThree(int n) {
        if(n==1){
            return true ;
        }
        if(n%3==0){
            return isPowerOfThree(n/3);
        }
        else if(n<3){
            return false;
        }
        else {
            return false;
        }
        
    }
    public  static boolean isPowerOfThree1(int n) {
        return n==3?true: n%3 ==0&& isPowerOfThree(n/3);
    }
    static boolean powOfThree(int n){
        if(n==1){return true ;}
        if(n==3){
            return true;
        }
        else if(n<3){
        return false;
        }
        
        return n%3==0 && powOfThree(n/3);
    }
    public static void main(String[] args) {
        System.out.println(powOfThree(24));
        System.out.println(isPowerOfThree(29));
    }
}
