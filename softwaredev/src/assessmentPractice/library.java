package assessmentPractice;

import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			book [] books = new book[3];

			for(int i=0;i<3;i++) {
			 System.out.println("please enter the name for book " + (i+1));
			 
			 String name = in.nextLine();
			 
			 System.out.println("please enter the author for book " + (i+1));
			 
			 String author = in.nextLine();
			 
			 System.out.println("please enter the genre for book " + (i+1));
			 
			 String genre = in.nextLine();
			 
			 book b =new book(name,author,genre);
			 
			 books[i] = b;
			}
			
			for(book b:books) {
				System.out.println(b);
			}
		}
		
	}//end main

}
