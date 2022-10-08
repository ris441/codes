


import java.util.Scanner;

public class BitwiseOperator {
public static void main(String [] args ){
    Scanner in= new Scanner(System.in);

  int c = -1  ;
  while(c!=4)
  {
    System.out.println("Enter the choice :");
    System.out.println("1.bitwise  And operation ");//1&1=1,  1&0=0, 0&0=0 
    System.out.println("2. bitwise Or operation ");// 1 |1=1,   1 |0=1,   0 |0=0
    System.out.println("3. bitwise Xor operation ");//a^a=0 , 1^1=0 ,0^0=0, 1^0=1 all follow the associavity 
    System.out.println("4. exit ");
    c=in.nextInt();
   if(c==4){continue;}
    System.out.println("Enter the number :");
    int a ;
    a = in.nextInt();
    System.out.println("Enter the number : ");
     int b;
     b = in.nextInt();
    int ans ;
  switch(c){
      case 1: 
      ans = new BitwiseAndOperator(a, b).And_operation();
     System.out.println(ans );
      break;
      case 2 :
      ans =new BitwiseOrOperator(a, b).Or_operation();
      System.out.println(ans);
      break;
      case 3:
      ans = new BitwiseXOrOperator(a, b).XOr_operation();
      System.out.println(ans);
      break;
      case 4:
      System.exit(0);
      break;
      default:
      System.out.println("You Choose a wrong operator !!!!");
      break;


  }
  
  }
  in.close();

}
}


class BitwiseAndOperator
{
   private  int x1 , x2 ;
    public BitwiseAndOperator(int a , int b ){
x1=a;
x2=b;

    }
    public int And_operation(){
        int ans = x1&x2;
        return ans ;
    }

}
class BitwiseOrOperator
{
   private  int x1 , x2 ;
    public BitwiseOrOperator(int a , int b ){
x1=a;
x2=b;

    }
    public int Or_operation(){
        int ans = x1|x2;
        return ans ;
    }

}

class BitwiseXOrOperator
{
   private  int x1 , x2 ;
    public BitwiseXOrOperator(int a , int b ){
x1=a;
x2=b;

    }
    public int XOr_operation(){
        int ans = x1^x2;
        return ans ;
    }

}