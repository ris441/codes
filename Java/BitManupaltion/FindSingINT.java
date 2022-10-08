



// Qus. is Find the single  integer  in array which occur only onces , other integer occur twice in array ;


public class FindSingINT{


    public static void main(String[] args) {
        int arr[] ={1,5,3,1,2,5,3,7,8,9,9,7,2,8,4};
        int ans=0 ;
        // This Ques is solve using the xor property which same number xor is o e.g. 5^5 = 0 
        for (int i = 0; i < arr.length; i++) {
            ans  = ans ^arr[i];//here xor of all Integer  in array . 
        }
         // which integer is remain  as ans which is occurs once in an array. 

        System.out.println("The single element is "+ ans);
    }
}