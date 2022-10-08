public class isNumberPowerOfTwo {
    public static void main(String[] args) {
        int n=7;  // 0111&1000 because 100&011
        if((n&(n-1))==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
