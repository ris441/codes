

public class LinearSearchRecursion {
  
    static int linearSearch(int[] arr , int index , int target){
        if(index==arr.length){
            return -1;
        }
        else if ( arr[index]==target){
            return index + 1; 
        }
        return linearSearch(arr, index+1, target);
    }
    static int a[] = {3,4,4,9,7};
    static int linearSearch(int index , int target){
        if(index==a.length){
            return -1;
        }
        else if ( a[index]==target){
            return index + 1; 
        }
        return linearSearch( index+1, target);
    }
    static boolean linearSearchRecursion(int [] arr , int index , int target ){
        /*
        here base condition is index == arr.length  its means  at the arr.length index
        no element is present and return false value if in your array present the target element 
        then store value and when the base condition is hit then return the false 
        and after return value or with the previous true / false  
         if  arr = 4,5,6 ,8 ,52
         and search = 8 ;
         i=0;
         In the 1. stack i!=length and its means check the arr[i]!=search it means store the false here and other side goto 
         the 
         // here i=1 and search = 8, length = 5
         2.stack   i != length and  its means check the arr[i]!=search it means store the false here and other side goto 
         the
// here i=2 and search = 8, length = 5
         3.stack   i != length and  its means check the arr[i]!=search it means store the false here and other side goto 
         the
         // here i=3 and search = 8, length = 5
         4.stack   i != length and  its means check the arr[i]==search it means  YOU GOT THE SEARCH ans 
         store the true  here and other side goto 
         the
         // here i=4 and search = 8, length = 5
         5.stack   i != length and  its means check the arr[i]!=search it means store the false here and other side goto 
         the
         // here i=5 and search = 8, length = 5
         6.stack   i == length here the base condition hit return the false to 5.stack 
         at the 5 stack  previously store false or with returned false which  return the  false ;
         at the 4 stack  previously store true or with the returned false which return the true ;
         at the 3 stack previous store false or with return true which return true to 2 stack ;
         at the 2 stack previous store false or with return true which return true to 1 stack ;
         at the 1 stack return the true value as a ans which means target element found in array ;
        */
return index==arr.length?false : arr[index]==target || linearSearchRecursion(arr, index+1, target) ;
    }
    
    public static void main(String[] args) {
        int arr[]= {3,4,4,9,7};
        System.out.println(linearSearchRecursion(arr, 0,4));
        System.out.println(linearSearch(arr, 0,9));
        System.out.println(linearSearch( 0,7));
    }
}
