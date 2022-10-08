public class ReturnSkip {
 public static void main(String[] args) {
   System.out.println( skipchar("AabhaAy YaADAaV"));
   System.out.println(skipstr("appp aopapple app"));
 }
 public  static String skipchar(String s){
     if(s.isEmpty()){
         return "";
     }
     char ch = s.charAt(0);
     if(ch=='a'){
         return skipchar(s.substring(1));
     }
     else{
         return s.charAt(0)+skipchar(s.substring(1));
     }
 }
 public static String skipString(String s){
     if(s.isEmpty()){
         return "";

     }
     char ch = s.charAt(0)  ;

     if(s.startsWith("apple")){
         return skipString(s.substring(5));

     }
     else{
         return ch+skipString(s.substring(1));
     }
 }
 public static String skipstr(String s){
     if(s.isEmpty()){
         return "";
     }
     if(s.startsWith("app")&& !s.startsWith("apple")){
         return skipstr(s.substring(3));
     }
     else{
         return s.charAt(0)+skipstr(s.substring(1));
     }
 }
}
