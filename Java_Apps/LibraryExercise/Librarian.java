package library_exercise;

public class Librarian {

	private Library library;

	public Librarian(Library library) {
		this.library = library;
	}

	//Receives an author and delegates the request to the library's printBooksFromAuthor method
	public void findMeBooksFromAuthor(String findAuthor) {
		library.printBooksFromAuthor(findAuthor);
	}

	//Delegates the request to the library's printAvailableBooks method
	public void findMeAvailableBooks() {
		library.printAvailableBooks();
	}

	//Receives a book's title and delegates the request to the library's printBookDetails method
	public void findMeBook(String findBook) {
		library.printBookDetails(findBook);
	}

	//Delegates the request to the library's printTheMostPopularBook method
	public void findMostPopularBook() {
		System.out.println(library.printTheMostPopularBook().toString());

	}

	//Checks if there is an available copy for renting. If yes, then it prints a message of success
	public boolean rentBook() {
		 library.printAvailableBooks();
			return true;
	}

}
