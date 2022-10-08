public class operator{
    public static void main(String[] args) {
        int n = 6; 
        // int num = 20;
        System.out.println(-n);
        System.out.println(~(n-1));
        // System.out.println(num & ~(num-1));
        System.out.println(n&~(n-1));
        // at the end result is :
        // -n or ~(n-1) result is equal because ~n given -(n+1)
        //n&~(n-1) result is last set bit if last bit is second then 2 is answer  if last set bit is first then answer is 1
    }
}