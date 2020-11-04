package assessment1;

import java.util.Scanner;

public class citizens {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			citizen [] citizen1 = new citizen[3];
			
			for(int i=0;i<3;i++) { // the 3 in the loop means the series of Q's repeats 3 times//
				System.out.println("please enter your first name " );
				String firstName = in.next();
				
				System.out.println("please enter your second name " );
				String secondName = in.next();
				
				System.out.println("please enter your  gender (M or F) " );  // caps required :(
				char gender = in.next().charAt(0);
																						//required if statement prompting a Q, depending on answers to question 3&4//
				System.out.println("what is your marital status (M or S) " ); // caps required :(
				char married = in.next().charAt(0);
				
				if((married == 'M') && (gender == 'F')) {			// if the user answer that they're female and married //
                    System.out.println("enter your maiden name");   // the program will prompt a question asking for the maiden name//
                    String maidenName = in.next();
				
				
				
				}   
			}
		}

	}// end main

}
