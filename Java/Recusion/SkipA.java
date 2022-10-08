public class SkipA {
    public static void main(String[] args) {
        skipChar("aRaISaHABHaa", "");
        skipStringapp("", "RishabhappYadavapple.");
    }
public static void skipChar(String s, String ans ){
    if(s.isEmpty()){
        System.out.println(ans);
        return;
    }
    char ch = s.charAt(0);
    if(ch=='a'){
        // skip 
        skipChar(s.substring(1), ans);
    }
    else{
        skipChar(s.substring(1), ans+ch);
    }
}
public static void skipString(String ans , String s){

    if(s.isEmpty()){
        System.out.println(ans);
        return; 

    }
    if(s.startsWith("apple")){
        skipString(ans, s.substring(5));

    }
    else{
        skipString(ans+s.charAt(0), s.substring(1) );

    }
}

public static void skipStringapp(String ans , String s){

    if(s.isEmpty()){
        System.out.println(ans);
        return; 

    }
    if(s.startsWith("app")&&!s.startsWith("apple")){
        skipStringapp(ans, s.substring(3));

    }
    else{
        skipStringapp(ans+s.charAt(0), s.substring(1));

    }
}
}
