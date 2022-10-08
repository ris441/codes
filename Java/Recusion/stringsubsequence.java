import java.util.ArrayList;

// import java.util.ArrayList;

public class stringsubsequence {
    public static void main(String[] args) {
        subSequenceAccii("", "abc");
        ArrayList <String> ans = subSequence1("", "abc");
        System.out.println(ans);
       
    }
     public static void subSequence(String ps, String ups){
         if(ups.isEmpty()){
             System.out.println(ps+" ");

             return;
         }
         subSequence(ps+ups.charAt(0), ups.substring(1));
         subSequence(ps, ups.substring(1));
     }
     public static ArrayList<String> subSequence1(String ps, String ups){
        ArrayList<String> ans = new ArrayList<>();
        if(ups.isEmpty()){
           
            ans.add(ps);
            return ans;

            
        }
        ans.addAll(subSequence1(ps+ups.charAt(0), ups.substring(1)));
        ans.addAll(subSequence1(ps, ups.substring(1)));
        return ans ;
    }
    public static void subSequenceAccii(String ps, String ups){
        if(ups.isEmpty()){
            System.out.println(ps+" ");

            return;
        }
        subSequenceAccii(ps+ups.charAt(0), ups.substring(1));
        subSequenceAccii(ps, ups.substring(1));
        subSequence(ps+(ups.charAt(0)+0), ups.substring(1));
    }
   
}
