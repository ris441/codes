public class IsArraySortedInDecreasingOrder {

    
        public static boolean isSorted(int[] arr ){
            return helper( arr , arr.length-1 );
        }
        
        private static boolean helper(int[] arr, int i) {
            if(i==0){return true;}
    
         return arr[i-1]>arr[i] && helper(arr, i-1);
    
        }
        public static boolean isSorted(int[] arr , int i){
            return  i==0 ? true : (arr[i-1]>arr[i])   &&   isSorted(arr, i-1);
        }
    
        public static void main(String[] args) {
            int [] arr = {78,75,56,25,12,0};
            System.out.println(isSorted(arr));
            System.out.println(isSorted(arr, arr.length-1));
        }
    }

