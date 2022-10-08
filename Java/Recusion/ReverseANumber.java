public class ReverseANumber {
    static boolean checkPalin(int n ){
        int ans = rev_num1(n);
        if(ans == n ){
            return true ; 
        }
        return false;
    }
    static void rev_num(int n, int s){
        if(n==0){
            System.out.println("The reverse Number is "+s);
            return;

        }
        int rem = n%10;
        s = s*10+rem;
        rev_num(n/10, s);
    }
    static  int  rev_num1(int n){
int digit = (int) (Math.log10(n))+1;
//System.out.println(digit);
return helper(n, digit);
    }
    private static int helper(int n, int digit) {
        if(n==0){
            return 0;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digit-1))+helper(n/10, digit-1);
        
    }
    public static void main(String[] args) {
        int num = 78540001;
       System.out.println(rev_num1(num));

       System.out.println(checkPalin(12321));
    }
}
