import java.util.Arrays;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int arr[]={8,9,2,7,6,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int i, int j) {
        // arr[i] = arr[i] ^ arr[j];
        // arr[j] = arr[j] ^ arr[i];
        // arr[i] = arr[j] ^ arr[i];
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
     
    public static void quickSort(int arr[] , int low , int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
         int mid = s+ (e-s)/2;
        int pivot= arr[mid];
        while(s<=e){
            while(pivot>arr[s]){
                s++;
            }
            while(pivot<arr[e]){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s , hi);
    }
}
