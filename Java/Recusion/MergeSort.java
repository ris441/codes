import java.util.Arrays;

public class MergeSort {
    
    public static void main(String[] args) {
        int [] arr = { 4,8,6,3,7,5,2,10};
        int ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int [ ] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid)) ;
        int [] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right) {

        int [] mix = new int[left.length+right.length];
        int l=0;
        int r=0;
        int m=0;
        while(l<left.length&&r<right.length){
            if(left[l]>right[r]){
                mix[m]=right[r];
                r++;
            }
            else{
                mix[m]=left[l];
                l++;
            }
            m++;

        }

        while(l<left.length){
            mix[m]=left[l];
            l++;
            m++;
        }
        while(r<right.length){
            mix[m]=right[r];
            r++;
            m++;
        }
                return mix;
    }
}
