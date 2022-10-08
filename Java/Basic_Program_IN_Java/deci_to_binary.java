



import java.util.Scanner;
import java.util.Vector;


public class deci_to_binary {
 public   static void meth_con_1(int n){
       for(int i =32; i>=0; i--){
           int k = n>>i;
           if((k&1)>0){
               System.out.print("1");
           }
           else{
               System.out.print("0");
           }
       }
       System.out.println();
   }
public static void  meth_con_2(int n){
    Vector<Integer>arr=new Vector<>();
    int i=0;
    while(n>0){
        int temp =n%2;
        arr.add(temp);
        n/=2;
        i++;
    }
    for (int j = arr.size(); j <=0; j--) {
        System.out.println(arr.elementAt(j));
    }
    System.out.println();
}
   
   public static void main(String[] args) {
    
    int n ;
    Scanner in = new Scanner(System.in);
n = in.nextInt();
meth_con_1(n);
in.close();
   }
}
