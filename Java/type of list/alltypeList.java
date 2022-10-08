import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class alltypeList {
    
    public static void main(String [] args){
        List<Integer> arraylist = new ArrayList<>();
        List<Integer>vector=new Vector<>();
        List<Integer>stack=new Stack<>();
        List<Integer>linkedlist= new LinkedList<>();
        arraylist.add(1);
        arraylist.add(2);

        System.out.println(arraylist.get(1));

       vector.add(3);
       vector.add(4);
        
       stack.add(5);
       stack.add(6);
       System.out.println(stack.toString());
       for (Integer integer : stack) {
           System.out.println(integer);
           
       }
       linkedlist.add(7);
       linkedlist.add(8);
        

    }
}
