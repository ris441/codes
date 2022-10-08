import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu{

	public static void main (String [] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("****** Wel-Come IN Library Management System ******");
		int c=-1;
		while(c!=3) {
			System.out.println("Login for Librarian Press 1 ");
			System.out.println("Login for Management Press 2 ");
			System.out.println("For exit Press 3 ");
			c=bfr.read();
			switch(c){
			case 1:
				// login for librarian 
				
				//Menu.LibrarianMenu();
				break;
			case 2:
				// login for Management
				
			//	Menu.ManagementMenu();
				break;
			case 3:
				System.exit(0);
                break;
            default :
                	System.out.println("You Entered Wrong Key Please Enter Again ");
                	break;

			
			}
		}
	}
}
