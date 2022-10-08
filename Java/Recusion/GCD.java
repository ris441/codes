public class GCD {
  
    static int gcd(int remainder , int q)
    {//q is greater than remainder  and then remainder is 
        //remaindeer = q%remaninder and  and q = remainder of that function 
      if (remainder == 0)
        return q; 
      return gcd( q%remainder , remainder); 
    }
    static int gcdArray(int [] arr ){

        int g= arr[0];
        for (int i = 1; i < arr.length; i++) {
            g = gcd(g,arr[i]);
        }
       // System.out.println("Greatest Common Divisor of Arrray is "+g);
return g; 

    }
 

    public static void main(String[] args) {
        int a= 16;
        int b= 32; 
        int ans = gcd(a,b);
       System.out.println("GCD of a and b is "+ ans);
        int[] arr ={24,27,21,81};
 
       int gcdarr= gcdArray(arr);
        System.out.println("Greatest Common Divisor of Arrray is "+gcdarr);
      
    }
}
