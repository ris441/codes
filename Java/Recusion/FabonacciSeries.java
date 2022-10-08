public class FabonacciSeries {
  public static int SumFabonacciNum(int n){
      if(n<=1){
          return n;
      }
      return SumFabonacciNum(n-1)+SumFabonacciNum(n-2);
  }
  public static int  PrintFabSeries(int n) {
      if(n==0){
          return 0; 
      }
      if(n==1 || n==2){
          return 1;
      }
      else{
          return PrintFabSeries(n-1)+PrintFabSeries(n-2);
      }
      
  }
    public static void main(String[] args) {
        System.out.println(SumFabonacciNum(4));
        int n=9;
        // for (int i = 0; i < n; i++) {
        //     System.out.println(PrintFabSeries(i));
        // }
        System.out.println(4);
    }
}
