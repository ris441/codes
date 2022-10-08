

import java.util.*;
public class TernaryOperator{
    public static void main(String [] args){
        System.out.println("THIS PROGRAM DEMOSTERATE TERNARY OPERATOR ( ? : ) FUNCTIONALITY ");
        Scanner in = new  Scanner(System.in);
        int a;
        System.out.println("Enter the value of  a  :");
        a=in.nextInt();
        System.out.println("Enter the value of b :");
        int b ; 
        b=in.nextInt();
        System.out.println("Question is you want to find answer if a>b then answer is a+b otherwise b - a ");
    int ans = (a>b)?(a+b ):(b-a);
    System.out.println(ans);
    in.close();

    }
}


