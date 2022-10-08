import java.util.Scanner;

public class AverageOfThree {
    public static void average(int n1 , int n2 , int n3 ){
        System.out.println("Average of three numbers is "+ (n1+n2+n3)/3);
    }
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        n1=in.nextInt();
        System.out.println("Enter the Number : ");
        n2=in.nextInt();
        System.out.println("Enter the Number : ");
        n3=in.nextInt();
        average(n1, n2, n3);
        in.close();
    }
}
