public class SubString{
public static void subsetString(String str ,  String subset,int n)
{
    if(n==str.length()){
        System.out.println(subset);
        return;
    }
        subsetString(str, subset+str.charAt(n), n+1);
        subsetString(str, subset, n+1);
       
   
}
    public static void main(String[] args) {
        subsetString("abc", " ", 0);
    }
}