import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int [] arr = { 4,8,6,3,7,5,2,10};
         mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInPlace(int [ ] arr, int s, int e ){
        if(e-s==1){
            return ;
        }
        int mid = s+ (e-s)/2;
        mergeSortInPlace(arr,s,mid) ;
        mergeSortInPlace(arr,mid,e);
         mergeInPlace(arr, s,mid ,e );
    }

    public static void mergeInPlace(int[] arr,int s,int mid,int e) {

        int [] mix = new int[e-s];
        int l=s;
        int r=mid;
        int m=0;
        while(l<mid&&r<e){
            if(arr[l]>arr[r]){
                mix[m]=arr[r];
                r++;
            }
            else{
                mix[m]=arr[l];
                l++;
            }
            m++;

        }

        while(l<mid){
            mix[m]=arr[l];
            l++;
            m++;
        }
        while(r<e){
            mix[m]=arr[r];
            r++;
            m++;
        }
    for (int i = 0; i < mix.length; i++) {
        arr[s+i]=mix[i];
    }
    }

}
