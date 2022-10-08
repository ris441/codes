import java.util.Scanner;

public class GreaterOfTwo {
    public static void checkGreater(int n1 , int n2 ){
        if(n1>n2){
            System.out.println("Greater Number is "+ n1);
        }
        else{
            System.out.println("Greater Number is "+ n2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int n= in.nextInt();
        System.out.println("Enter the Second Number : ");
        int m = in.nextInt();
        checkGreater(n, m);

        in.close();
    }
}
