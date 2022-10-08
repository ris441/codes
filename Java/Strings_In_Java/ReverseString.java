import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Accept a String : ");
    //     String s = in.next();
    //     StringBuffer sbr= new StringBuffer(s);
    //     sbr.reverse();
    //     System.out.println("Reverse String using the StringBuffer class is "+sbr.toString());
    //     System.out.println("The String is "+ s );
    //     int len = s.length();
    //     String str1 = s.substring(len/2 -1 , len/2+2);
    //     System.out.println("Three character from middle character "+str1);
    //     String str2 = sbr.toString();
    // System.out.println("Printing Reverse String using string "+ str2 );
    String sb = "faberty";
    StringBuffer bf = new StringBuffer(sb.substring(0,1));
    System.out.println(bf.reverse());
    
    }
}
