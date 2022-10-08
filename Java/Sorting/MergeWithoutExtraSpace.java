import java.util.Arrays;

public class MergeWithoutExtraSpace {

   static public  void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=0; 
        long temp =0; 
        while(arr1[n-1]>arr2[0] && i<n){
            if(arr1[i]>arr2[0]){
                temp = arr1[i]; 
                arr1[i]= arr2[0];
                arr2[0]=temp;
                Arrays.sort(arr2);
            }
            i++;
        }


    for (int t = 0; t< n; t++) {
        System.out.print(arr1[t]+" ");
    }
    for(int t=0; t<m;t++){
        System.out.print(arr2[t]+" ");
    }
         
     }
     
    

public static void main(String[] args) {
    long arr1[]={1,3,5,7};
    int n=arr1.length;
    long arr2[]={0,2,6,8,9};
    int m=arr2.length;
    //merge(arr1, arr1, n, m);
    int i=0; 
    long temp =0; 
    while(arr1[n-1]>arr2[0] && i<n){
        if(arr1[i]>arr2[0]){
            temp = arr1[i]; 
            arr1[i]= arr2[0];
            arr2[0]=temp;
            Arrays.sort(arr2);
        }
        i++;
    }
    
    for (int t = 0; t< n; t++) {
        System.out.print(arr1[t]+" ");
    }
    for(int t=0; t<m;t++){
        System.out.print(arr2[t]+" ");
    }
   
  

}
    
}
