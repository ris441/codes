import java.util.Arrays;

//   https://leetcode.com/problems/merge-sorted-array/

public class LeetCodeMergeSort {
    public static void swap (int [] arr1, int i, int [] arr2, int j){
        int temp = arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }
    public static void helper(int []nums1,int m , int[] nums2,int n){
        int index2=0;
        while(index2<n){
            if(nums1[0]>nums2[index2]){
                swap(nums1, 0, nums2, index2);
                Arrays.sort(nums1, 0,m );
                Arrays.sort(nums2,0,n);
            }
        else    {
        
            index2++;
            }
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // int p1=m-1,p2=0;
        // helper1(nums1, p1, nums2, p2,n);
        helper(nums1, m, nums2, n);
    }
    // here p1 is last index of sorted array nums1
    //here p2 is first index of sorted array nums2
    public static void helper1(int [] nums1,int p1,int []nums2, int p2, int n){

if(p2>n){
    return;
}
if(nums1[p1]>nums2[p2]){
    swap(nums1, p1, nums2, p2);
    Arrays.sort(nums1, 0,p1 );
    Arrays.sort(nums2,0,n-1);
    helper1(nums1, p1, nums2, p2+1,n);
}
else
helper1(nums1, p1, nums2, p2+1,n);
    }
    public static void main(String[] args) {
       int [] nums1 = {1,2,3,0,0,0},nums2 = {2,5,6}; 
        int m = 3,  n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }

}
