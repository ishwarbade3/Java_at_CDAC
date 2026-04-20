package assignment;

public class Book {
	private String genre;
	private String title;
	private String auther;
	private int copies;
	public Book() {}
	public Book(String genre, String title, String auther, int copies) {
		super();
		this.genre = genre;
		this.title = title;
		this.auther = auther;
		this.copies = copies;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Book : " + genre + "\t" + title + "\t" + auther + "\t" + copies;
	}
	
}
