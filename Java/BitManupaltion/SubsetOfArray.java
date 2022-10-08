import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {
    static public void getSubset(int [] arr , int n){
        for (int num  = 0;  num < (1<<n) ; num++) {
            List<Integer> tarr = new ArrayList<>();
        for (int bit = 0; bit < n; bit++) {
            if((num&(1<<bit))>0){
                tarr.add(arr[bit]);
            }
        }
        for (int element : tarr) {
            System.out.print(element+" ");
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,2,4};
        int n= arr.length;
        getSubset(arr, n);
    }


}
