import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class StrTokenizer {
     

    public static void main( String [] args ) throws IOException{
        String str = new String();
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          str = in.readLine();
         String mydeli = ",";
         int countTokens=0;

         StringTokenizer stok = new StringTokenizer(str,mydeli);
         
         countTokens= stok.countTokens();
         System.out.println("Total Tokens "+countTokens);
         while(stok.hasMoreTokens()){
          //  System.out.println(stok.nextToken(","));
          System.out.println(stok.nextToken());
         }
         StringTokenizer token = new StringTokenizer("this :  is : hello : world : program : using : String Tokenizer : class ", ":");
         countTokens= token.countTokens();
         System.out.println("Total tokens");
         while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
         }



     }

    }
