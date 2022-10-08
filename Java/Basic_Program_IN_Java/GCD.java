public class GCD {
    static int gcd(int remainder , int q)
    {
      if (remainder == 0)
        return q; 
      return gcd( q%remainder , remainder); 
    }
    public static void main(String[] args) {
        int a= 64;
        int b= 36; 
        int ans = gcd(a,b);
        System.out.println(ans);
    }
}
