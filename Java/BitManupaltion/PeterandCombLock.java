import java.util.Scanner;

public class PeterandCombLock {
    static public boolean getSubset(int [] arr , int n){
        for (int num  = 0;  num < (1<<n) ; num++) {
            int tempans=0;
        for (int bit = 0; bit < n; bit++) {
            if((num&(1<<bit))==0){
            tempans-=arr[bit];
            }
            else{
                tempans+=arr[bit];
            }
        }
      if(tempans%360==0){
return true;
      }
       
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n; 
     n= in.nextInt();
     
     int arr []= new int [n];
     for (int i = 0; i < arr.length; i++) {
         arr[i]=in.nextInt();}
         if(getSubset(arr, n)){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }

     











    }
}
