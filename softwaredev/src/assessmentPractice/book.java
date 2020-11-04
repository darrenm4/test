package assessmentPractice;

public class book {
	
	//Variables 
	private String name;
	private String author;
	private int ISBN;
	private String genre;
	private char status;
	private static int noOfBooks=0;
	private static int nextISBN = 1;
	
	//Consructors
	public book(String name, String author, String genre) {
		super();
		setName(name);
		setAuthor(author);
		setGenre(genre);
		setStatus('A');
		setISBN(nextISBN);
		nextISBN ++;
		noOfBooks++;
	}
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public static int getNoOfBooks() {
		return noOfBooks;
	}
	public static void setNoOfBooks(int noOfBooks) {
		book.noOfBooks = noOfBooks;
	}
	
	//toString
	@Override
	public String toString() {
		return "book [name=" + name + ", author=" + author + ", ISBN=" + ISBN + ", genre=" + genre + ", status="
				+ status + "]";
	}

	//misc metohds
	public void Borrow() {
		setStatus('B');
	}
	
	
}
