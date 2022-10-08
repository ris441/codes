import java.util.HashMap;
import java.util.Map;
// find two number which is occur once in array 
public class map_FindTwoNum {
    public static void main(String[] args) {
        int arr[]={4,5,5,6,2,6,4,7};
      Map<Integer,Integer> map=new   HashMap<Integer,Integer>() ;
      for (int i = 0; i < arr.length; i++) {
          map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
      }
      for(Map.Entry<Integer,Integer> ou_element : map.entrySet()){
//System.out.println(ou_element.getKey()+" = "+ ou_element.getValue());
if(ou_element.getValue()==1){
    System.out.println(ou_element.getKey());
}
      }


        }
}
