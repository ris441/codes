public class BinaryConvert {
public static void binarynum(int n ){
    if(n==0){
        return ;
    }
    binarynum(n/2);
    System.out.println(n%2);
}
  
    public static void main(String[] args) {
        binarynum(8);
    }
}
