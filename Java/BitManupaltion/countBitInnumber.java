public class countBitInnumber{
    static int log2(double number){
        return (int) ( Math.log(number)/Math.log(2));// give the log2(n)=log2(2^x)=x
    }
    static int countUsingTraversel(int n) {
        int count =0;
        while(n!=0){
            count++;
            n>>=1;//right shifting bit using Shift operator 101>>=1  => 010
        }
        return count;
    }
        static int countBits(int number)
    {
         
        // log function in base 2
        // take only integer part
        return (int)(Math.log(number) /
                     Math.log(2) + 1);
    }
    public static void main(String[] args) {

        System.out.println("Using log2 function  log2(16) "+ log2(16));
        System.out.println("In this line loge(n)+1  => "+(int)Math.log(16)+1);// loge(n)=Math.log(n)
        System.out.println("In this line Using Math.log(n)/Math.log(2) getting log2(n)  is "+Math.log(16)/Math.log(2));
        System.out.println("Math.log built function :"+Math.log(16)+1);
        System.out.println("Using built IN  Math.log function getting no. of bits :"+Math.log(16)/Math.log(2) +1);
        System.out.println("Using Traversel Of bits getting the no. of bit of 16 is  :"+countUsingTraversel(16));
        System.out.println("Using Traversel Of bits getting the no. of bit of 16 is  :"+countUsingTraversel(4));
        System.out.println(countBits(4));
      //  System.out.println(Math.log(1000000000)/Math.log(2)+1);
      int cont= 45;
      System.out.println("Using Traversel Of bits getting the no. of bit of 45 is  :"+countUsingTraversel(cont));
    }
}