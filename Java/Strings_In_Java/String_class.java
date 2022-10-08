import java.io.IOException;

// 

public class String_class {
    public static void  main( String [ ] args )throws IOException {
        FastReader in = new FastReader();
        // we can declare string in the two type 
        //1.
        try {
        String str1  = "rishabh";// in this type of declaration if the string 
        //variable have same string then points to same memory allocation  . 
        String str2 = "rishabh";
        // // for example :-
        // str1 and str2 points to the same memory block ;
        //  //System.out.println("str1 =  "+ str1 );
        // // System.out.println(" str2 = "+ str2 );
        // System.out.println(" Memory Address of str1 and str2  is  same : "+ str1 == str2 );
        // String str = new String("rishabh");
        // //System.out.println("memory address  of the str "+ str );
        // //but str1 and  str not point to same memory block ; 
        // System.out.println( " Memory address str and str1  is same : "+ str == str1 );
        
        
        
        String instr;
        // instr = in.next();// this function is used to input of singal token 
        // //if you input the rishabh yadav this will show you only the rishabh 
        // System.out.println("using the next method store string* "+ instr +
        //  " *While input is rishabh yadav ");
     instr = in.nextLine();// you can overwrite string but you can't update string 
        //  System.out.println("using the nextline  method store string* "+ instr +
        //  " *While input is rishabh yadav ");


         // fuctions of string 

        // 1 charAt( int index ) - return the character of the given  index of the  string 
        // int i=0 ;
        // int n= instr.length()-1;// return the length of the string ;
        // System.out.println(" length of the string is "+ n);

        // while (n>=0){
        //    // System.out.println(" Character at the index "+ i + " is "+ instr.charAt(i));
        //    System.out.printf("%nCharacter at the index  %d is %C%n ",i,instr.charAt(i));
        //    System.out.printf("%nCharacter at the index  %d is %c%n ",i,instr.charAt(i));
        //    i++;
        //     n--;
        // }
        // 2  isEmpty() - return the boolean value  true if the string is empty 
        String st1 = " rishabh ";
        String st2 = " yadav ";
        String st ="";
// System.out.println("st1 is  Empty " + st1.isEmpty());
// System.out.println("st is  Empty " + st.isEmpty());



// 3 substring(int beginindex , int endindex )
// begin = start index , end = end+1;
// if string is rishabh yadav 
String substr1 = instr.substring(0,7);
String substr2 = instr.substring(8,13);
// System.out.println("Firsst substring is "+ substr1);
// System.out.println("Second substring is "+ substr2);
// String subst= instr.substring(8);
// System.out.println(subst);

// 4 concat(String str)

String s = substr1.concat(substr2);
System.out.println(s);


    }
        catch( Exception e ){
            System.out.println(e.getStackTrace());
        }
         
    }

}
