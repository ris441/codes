public class ClearLastSetbit {
    public static void main(String[] args) {
        int n=5;
        // 101 &100=100-> 4+1 -> 4
        // 111 &110=110->4+2+1->4+2
        //1010&1001=1000-> 8+2->8
        int ans = n&(n-1);
    
        System.out.println(ans);
    
    }
    
}
