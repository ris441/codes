

public class isIthBitSet {
    public static boolean is_ith_set(int n, int i){
        int mask = 1<<i;//using left shift operator 1<<1=010
//   101 = 5 
//   010 = mask of 1st bit 
//after And operator  ans  is o it means bit is not set 

        if((n&mask)!=0){
return true ;
        }
        return false;
    }
    public static void main(String[] args) {
        // 5 = 101 HERE 0th bit is set , 1st bit is not set and last 2nd bit is set 
        int n=5; 
        int i = 1;
        System.out.println(is_ith_set(n, i)==true ? "BIT IS SET" : "BIT IS NOT SET" );
    }
}
