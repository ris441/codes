import java.util.Scanner;

public class SumOfOdd {
    public static void sumOfOdd(int n ){
        int sum =0;
        for (int i = 1; i <= n; i++) {
            if(i%2 !=0){
               // System.out.println(i);
               sum+=i;
            }
        }
        System.out.println("Sum of Odd "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int n;
         Scanner in = new Scanner(System.in ); 
         n= in.nextInt();
     sumOfOdd(n);
    }
}
