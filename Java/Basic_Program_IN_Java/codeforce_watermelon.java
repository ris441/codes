import java.util.Scanner;

public class codeforce_watermelon {
    public static void main(String[] args) {
        long  n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        if((n&1)==0){
            if(n==2){
                System.out.println("NO");
            }
            else
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }



        in.close();
    }
}
