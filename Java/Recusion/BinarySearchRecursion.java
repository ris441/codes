public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] arr = { 2,9,45,50,96};
        System.out.println(B_Search(0, arr.length-1, arr, 96));
    }
    public static int B_Search(int start, int end , int arr[],int target){
        int mid =  start + (end-start)/2;
        if(start>end){
            return -1;
        }
        else if(arr[mid]==target){
return mid+1;
        }
        else if( arr[mid]>target){
          return  B_Search(start, mid-1, arr, target);
        }
return B_Search(mid+1, end, arr, target);
    }
}
