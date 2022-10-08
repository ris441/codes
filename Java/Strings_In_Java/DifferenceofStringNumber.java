public class DifferenceofStringNumber {
    public static void main(String[] args) {
        // This concept is use in codechef Prefix Zeros 
        // https://www.codechef.com/LTIME104C/problems/PREZ 
        String s= "4525";
        int ops =0; 
        for (int i = s.length()-1; i >= 0; i--) {
            int req = (ops + s.charAt(i)-'0')%10;
            // req equals  the previous ops + s[i] which can perform previously 
           
            if(req !=0){
                ops += 10 -req ; 
            }
            // ops is the no . of Operation to make s[i] ='0' if s[2]='2' no. ops
            // is 8 hence s[2]='0' i.e 10%10=0
            //if s[1]='5'     s[1]=('5'+ops)%10=(5+8)%10=13%10=3 
            //no. ops is now ops = ops + 10 - s[1]= ops + 7= 15

            System.out.println(i+" th  index  " +s.charAt(i)+"at this total no. of operations  "+ops);
        }
    }
}
