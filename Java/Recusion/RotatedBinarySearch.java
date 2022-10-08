public class RotatedBinarySearch {
    /// errror in code need to modife
    
    public static void main(String[] args) {
        int [] arr = {4,8,9,11,1,3};
        System.out.println(R_B_Search(0, arr.length-1, arr, 1));

    }
  public static  int R_B_Search(int s , int e , int [ ] arr ,int target){
      int mid = s + (e-s)/2;
      if(arr[s]<arr[mid]){

        if(arr[s]<=target&& target<= arr[mid]){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
      }
      if(target>=arr[mid]&&target<=arr[e]){
          s= mid+1;
      }
      else{
          e=mid-1;

      }
    return  R_B_Search(s, e, arr, target);
  }
}
