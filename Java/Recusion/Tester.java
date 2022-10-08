import java.util.Scanner;

class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int i =1;
		while(n>0){
		    System.out.print(i+" ");
		    i=i*2;
		}
        s.close();
	}
}
