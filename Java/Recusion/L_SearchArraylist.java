import java.util.ArrayList;

public class L_SearchArraylist {
    static ArrayList<Integer> LS_Argu(ArrayList<Integer>ans,int arr [], int index, int target){
        if(index==arr.length){
           return ans;
        }
        else if(arr[index]==target){
            ans.add(index+1);
            
        }
        return LS_Argu(ans, arr, index+1, target);
    } 
     static ArrayList<Integer> ans= new ArrayList<>();
 static ArrayList<Integer> LS_WithOutArgu(int arr[] , int index , int target ){
     if(index==arr.length){
         return ans;
     }
     else if ( arr[index]==target){
         ans.add(index+1);
         

     }
     return LS_WithOutArgu(arr, index+1, target);
 }
static ArrayList<Integer> LS_InsideArraylist(int arr [], int index , int target ){
    ArrayList<Integer> list = new ArrayList<>() ;

    if(index==arr.length ){
        return list;
    }
    else if ( arr[index]==target){
list.add(index+1);
    }
    ArrayList<Integer> belowCallsAns=LS_InsideArraylist(arr, index+1, target);
    list.addAll(belowCallsAns);
    return list;

}
    public static void main(String[] args) {
        int[] arr ={5,7,21,5,4,6};
        ArrayList<Integer>ans=new ArrayList<>();
        System.out.println(LS_Argu(ans, arr, 0, 5));

        System.out.println(LS_WithOutArgu(arr, 0, 5));
        System.out.println(ans.toString());
    }
}
