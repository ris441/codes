public class LCM {
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
    static long  Cal_LCM(int n , int m )
{
    int g = gcd(n,m);
    long l= n*m/g;
    return l;
}
static long Mul_Arr_all_element(int[] arr, long  ans, int n  ){
if(n<0)
{
return ans ;
}
ans = ans *arr[n--];
return Mul_Arr_all_element(arr, ans,n);
}


static long ArrayLCM(int [] arr ){

long mularr= Mul_Arr_all_element(arr, 1,arr.length-1);
int gcdarr = gcdArray(arr);
long lcmarr=mularr/gcdarr;
return lcmarr;

}
public static void main(String[] args) {
    int a = 64 , b =36 ;
    long  lcm =Cal_LCM(a, b);
    System.out.println("LCM of a and b is "+ lcm);
        int[] arr ={4,18,14,6};
        // long ans = 1; 
        // int n =arr.length-1;
        long lcmarr = ArrayLCM(arr);
        System.out.println("LCM OF Array is : "+ lcmarr);

 
}
}
