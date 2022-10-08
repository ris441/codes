

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// this class is used Fast input 
public class FastReader {
    // static class FastReader {
        BufferedReader br ;
        StringTokenizer st ;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str ="";
            try {
                str = br.readLine();
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            return str;
        }
            
        }
    //  public static void main(String[] args) {
    //          FastReader in = new FastReader() ;
    //          int integer = in.nextInt();
    //          long LONG = in.nextLong();
    //          double Double = in.nextDouble();
    //          String str = in.nextLine();
    //          System.out.println(
    //              " \n integer = "+integer +
    //              " \n long = "+ LONG+
    //              " \n Double = "+ Double+
    //              "\n str= "+ str 
                 
    //          );
    //     }

