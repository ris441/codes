import java.util.Scanner;

public class RomanticReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in); 
    int  t;
        t=in.nextInt();
        while(t>0){
        
        String s;
        
        int n;
        n=in.nextInt();
        int k;
        k=in.nextInt();
        
        
        s=in.next();
        System.out.println(rr(s,k));
        t--;
    }
        in.close();
    }

    private static String rr(String s,int k) {
        String temp=s.substring(0,k) ;
        
       for (int i = k-1; i >=0; i--) {
           String t = temp.substring(0,i+1);
        StringBuffer rev =new  StringBuffer(t);
        rev.reverse();
        temp = temp.replaceAll (t,rev.toString());

       }
    temp = temp+s.substring(k,s.length());
        return temp;
    }
}
