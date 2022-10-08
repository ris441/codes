import java.util.ArrayList;

import java.util.List;

public class ArrayListtype{
    

    public static void main (String []args){
        // Array  type of list is created  by using following Syntax :
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.toString());
       list.remove(1);
        list.remove(1);
        list.add(0,5);
        list.add(3,6);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println(list.size());
        list.set(1, 7);// this function delete value of the index and set the value at index 
        List<Integer> c = new ArrayList<>();
        c.add(3);
        c.add(2);
        c.add(1);
        // add all element of c  in list at the end
     list.addAll(c);
     // add all element at 4 th position
     list.addAll(3,c);
        System.out.println(list.toString());
    }
}