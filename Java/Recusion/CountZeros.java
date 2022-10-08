public class CountZeros {
    
static int zeros(int n){
    return helper(n,0);
    
}

    private static int helper(int n, int i) {
        if(n==0){
            return i;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, ++i);

        }
        return helper(n/10, i);
    
}

    public static void main(String[] args) {
        int ans = 100058;
        System.out.println(zeros(ans));
    }
}
