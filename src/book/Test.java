package book;

import book.Book;
import book.Library;

import java.time.Year;

public class Test {
  public static void main(String[] args) {
    Library library = new Library();
    library.doesBookExist(new Book("2345", "gh", Year.of(1999)));

    //checker første bog der blev oprettet
    Book book = library.getBooks().get(0);
    library.doesBookExist(book);


  }
}
