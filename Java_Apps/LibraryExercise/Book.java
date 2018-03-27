package library_exercise;

public class Book {

	private String title;
	private Author author;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	final String isbn;

	public Book(String title,Author author,String isbn,int physicalCopies,int availableCopies,int timesRented) {
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.physicalCopies=physicalCopies;
		this.availableCopies=availableCopies;
		this.timesRented=timesRented;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", physicalCopies=" + physicalCopies
				+ ", availableCopies=" + availableCopies + ", timesRented=" + timesRented + ", isbn=" + isbn + "]";
	}

	public boolean isAvailable() {
		if(this.physicalCopies-this.availableCopies>=1) {
			return true;
		}else {
			return false;
		}	

	}

	public int getTimesRented() {
		return timesRented;
	}

	public boolean hasAuthor(String authore) {
		if(authore.equals(author)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	

}
