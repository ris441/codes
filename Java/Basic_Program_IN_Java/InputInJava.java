import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class InputInJava{
    public static void main (String [] args) throws IOException
    
    {
    // using Buffered Reader class 
    BufferedReader bfr = new BufferedReader(
        new InputStreamReader(System.in));
    String name = bfr.readLine();
    System.out.println("Name is "+ name);
    // using Scanner class 
    Scanner scn = new Scanner(System.in);
    String  enroll = scn.nextLine();
    System.out.println("Enroll - " + enroll);
    scn.close();
    // Using console to Input data from user 
    // this line of statements are not run on IDE's 
    /*
    String p = System.console().readLine();
    System.out.println("You enter "+  p );
    */
    
    }

}