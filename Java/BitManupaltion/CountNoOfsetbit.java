public class CountNoOfsetbit {
public static void NOofSetBit(int n )
{
    
    int count=0;
    while(n!=0){

        if((n&1)==1){

            count++;
        }

        n= n>>1;//left shift operator;
    }
    System.out.println(count);
}   
public static void CountLastSetBit( int n){
    int count= 0;
while(n!=0){
    n=n&(n-1);
    count++;
    
}
System.out.println(count);
} 
    public static void main(String[] args) {
        int n=13;
        NOofSetBit(n);

        CountLastSetBit(n);
    }
}
