package GFGQuestion;



public class SortAlgo {
 public static void cylicSort(int arr[]) {
        // when given range 1 to N then we use This Sorting 
        int i=0; 
        while(i<arr.length){
            int correctIndex = arr[i]-1; 
            if(correctIndex!=i){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }

public static void insertionSort(int arr[ ], int n) {
    // simpliy logic is sort the array  till i th index 
for (int i = 0; i < arr.length-1; i++) {
    for (int j = i+1; j > 0; j--) {
        if(arr[j]<arr[j-1]){
            swap(arr, j,j-1);
        }
        else{
            break;
        }
        
    }
}

}

public static void selectionSort(int arr[ ], int n) {
    // as the name suggest selection sort you can select a number and put it at the right position 
    // select the largest element in the array 
    
    for (int i = 0; i < arr.length; i++) {
        int last = arr.length-i-1;
        int maxIndex=getMaxIndex(arr , 0, last);     
swap(arr, last,maxIndex);
        }
    }


private static int getMaxIndex(int arr[],int start, int end) {

    int max = start ;
    for (int i = start; i <= end; i++ ) {
        if(arr[max]<arr[i]){
            max=i;
        }
        
    }
    return max;
    
}

static public  void bubblesorting(int arr[] , int n) {
    // here logic is to sort array with at the adj. indexs and at first iteration largest element
    // is last position and second iteration second largest element is second last position in array and so on .
    
    for (int i = 0; i < arr.length-1; i++) {
        int m=n-i;
        int j=1;
        while(j<m){
            if(arr[j]<arr[j-1]){
                 swap(arr,j-1,j);
               
            }
            j++;
        }
    }
    for (int i=0 ; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
static public void swap ( int arr[],int n1, int n2  ){
    int temp =arr[n1];
    arr[n1] = arr[n2]; 
    arr[n2]=temp;
}

    public static void main(String[] args) {
        int  arr[] = {2,4,1,5,3,8,6,7};
     int n= arr.length;
   //  bubblesorting(arr, n);
     
    // insertionSort(arr, n);
   // selectionSort(arr, n);
   cylicSort(arr);
     for (int i=0 ; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    }
}
