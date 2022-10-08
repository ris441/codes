import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);

        for (List<Integer> list : ans) {
                System.out.println(list);
        }
    }
   public static List<List<Integer>> subset (int [] arr){
    List<List<Integer>> outer = new ArrayList<>() ;
// adding the empty list in the outer list 
    outer.add(new ArrayList<Integer>() );

    // int n = outer.size();
    for (int num : arr) {
        
    int n = outer.size();
        for (int i = 0; i < n; i++) {
            List<Integer> internal = new ArrayList<>(outer.get(i));
            
            // adding the previous outer elements  in the list add the element of array  
            internal.add(num);
            outer.add(internal);
        }
    }
    return outer;
   }
}
