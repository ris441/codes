import java.util.Scanner;

// this program is used set the ith bit of the number 
public class Set_ith_bit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,i;
        System.out.println("Enter the Number : ");
        a=in.nextInt();
        System.out.println("Enter i th bit ");
        i= in.nextInt(); 
        int mask = 1<<i;
        System.out.println("Number is "+ a);
        a= a|mask;
        System.out.println("Number after seting the i th bit "+ a);
        in.close();
    }
    
}
