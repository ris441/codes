
import java.util.Arrays;
public class MergeSortedArray{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     
        
        int s1=0;
        int s2 =0;
       int index =0;
        int []ans=new int[n+m];
        while(s1<m){
  
          if(nums1[s1]<nums2[s2]){
  
             
              ans[index++]=nums1[s1];
              s1++;
             
          }
            else{
                 int temp = nums1[s1];
              nums1[s1]=nums2[s2];
              nums2[s2]=temp;
            }
            
          
          
        }  
        
         System.out.println(Arrays.toString(ans));
      
      }
     
    public static void main(String [] args){
        int arr1[]={1,2,3,0,0,0};
        int n1=3;
        int arr2[]={2,5,6};
        int n2= 3;
merge(arr1, n1, arr2, n2);
    }
}