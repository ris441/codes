public class IsArraySortedInIncreasingOrder{
    
    public static boolean isSorted(int[] arr ){
        return helper( arr , 0 );
    }
    
    private static boolean helper(int[] arr, int i) {
        if(i==arr.length-1){return true;}

     return arr[i]<arr[i+1] && helper(arr, i+1);

    }
    public static boolean isSorted(int[] arr , int i){
        return  i==(arr.length - 1 ) ? true : (arr[i]<arr[i+1])   &&   isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int [] arr = {4,5,6,8,15,46,85};
        System.out.println(isSorted(arr,0));
    }
}