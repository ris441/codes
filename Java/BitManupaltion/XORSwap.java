

public class XORSwap {
    public static void main(String[] args) {
        int a = 2 , b= 6 ;
        // xor swap is happen xor property which is same - same cancel out  means 
        // In first step  xor of two number is store in first Integer  ;
        // in second step xor of  two number is store in second Integer in this step second number is cancel and first number is store in second integer
        // IN the Third step again xor of a   and b store in a in this time first integer is cancel because in b first integer is store and In a second integer is store 

        a= a^b;//a= 2^6;
        b=a^b; // b = 2^6^6= 2;
        a=a^b;//a=2^6^2=6;
    }
    
}
