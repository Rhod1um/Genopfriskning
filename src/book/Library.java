package book;

import book.Book;

import java.time.Year;
import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books;

  Library(){
    books = new ArrayList<>(); //add i constructor
    addBook();
  }

  public void addBook(){
    books.add(new Book("0001", "To Kill A Mockingbird", Year.of(1940)));
    books.add(new Book("0002", "Pride and Prejudice", Year.of(1930)));
    books.add(new Book("0003", "Notes From The Underground", Year.of(1880)));
  }

  public boolean doesBookExist(Book book){
    for(Book b : books) { //for(datatype navn : liste)
      if (b.getISBN().equals(book.getISBN())) {
        System.out.println("book exists");
        return true;
      }
      else System.out.println("book does not exist");
    }
    return false;
    //return books.contains(book); kan bruges for objecter og specifiere
    //attribut man vil sammenligne som i dolphin. Men objekterne her med samme
    //ISBN nummer er vel så ikke ens fordi objekterne ikke er ens (ikke samme memory adresse?)
  }

  public ArrayList<Book> getBooks(){
    return books;
  }


  //spm eksamen sikkert: at når et objekt laves i main og en variabel i konstruktoren sættes så at kunne
  //forklare hvordan variablerne hopper rundt.

}
