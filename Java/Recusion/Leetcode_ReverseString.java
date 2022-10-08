// https://leetcode.com/problems/reverse-string/submissions/


import java.util.Arrays;

public class Leetcode_ReverseString {
    public static void reverseString(char[] s) {
    
        helper(s,0);
        System.out.println();
    }
    private static void helper(char[] s, int i) {
        if(i==s.length){
            return ;

        }
        helper(s,i+1);
        //ans+=s[i];
        System.out.print(s[i]);
        
    }
    public static void reverseString1(char[] s) {
    
       helper1(s,0,s.length-1);
       System.out.println(Arrays.toString(s));
    }
    private static void helper1(char[] s, int i, int j) {

        if(i>j){
            return;
        }

        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
        helper1(s, i+1,j-1);
        
    }
    
    public static void main(String[] args) {
        char s[]={'h','e','l','l','o'};
        reverseString1(s);
    }
}
