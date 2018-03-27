package library_exercise;

import java.util.Arrays;

public class Library {

	private Book book[];

	public Library(Book[] book) {
		this.book = book;
	}

	// Prints books that have at least one available physical copy.
	public void printAvailableBooks(){
		for(int i=0;i<book.length;i++) {
			if(book[i].isAvailable()==true) {
				System.out.println(book[i].toString());
			}
		}
	}

	//(Searches for a book based on a given title.
	public void printBookDetails(String title) {
		for(int i=0;i<book.length;i++) {
			if(book[i].getTitle().equals(title)) {
				System.out.println(book[i].toString());
			}else {
				System.out.println("Sorry we dont have it!");
			}
		}
	}

	//Prints only the books that have an author that matches a given name
	public void printBooksFromAuthor(String author){
		for(int i=0;i<book.length;i++) {
			if(book[i].getAuthor().getName().equals(author)) {
				System.out.println(this.book[i].toString());
			}else {
				System.out.println("Sorry we dont have it!");
			}
		}

	}

	//Returns the book with the highest number of the timesRented field.
	public Book printTheMostPopularBook() {
		Book maxBook = book[0];
		int maximum=-1;
		for(int i=0;i<book.length;i++) {
			if(book[i].getTimesRented()>maximum) {
				maxBook=book[i];
				maximum=book[i].getTimesRented();
			}
		}
		return maxBook;
	}

	@Override
	public String toString() {
		return "Library [book=" + Arrays.toString(book) + "]";
	}


}
