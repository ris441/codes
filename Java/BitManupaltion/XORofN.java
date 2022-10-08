


public class XORofN {

    public static int xorN(int n){
            /**
     * n=1, ; ------ 1%4==1, ans = 1;
     * n=2,  ------ 2%4==2, ans=3=n+1; 
     * n=3,  ------- 3%4==3, ans= 0;
     * n=4, ------ 4%4==0, ans=4=n; 
     * n=5, ------5%4==1, ans=1; 
     * n=6,------ 6%4==2 , ans=7; 
     * n=7 ------7%4==3,ans=0;
     * n=8,------8%4==0 , ans=8; 
     *  */ 
     
    if(n%4==0){
       return n;

    }
    else if(n%4==1){

        return 1; 

    }
    else if(n%4==2){
        return n+1;
    }
    else if (n%4==3){
    return 0 ;
    }
    return -1;
}   
public static void main(String[] args) {
    int n= 147;
System.out.println( "Xor of N number is "+ xorN(n));
}    
}
