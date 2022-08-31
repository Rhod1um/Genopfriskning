package book;

import javax.print.attribute.DateTimeSyntax;
import java.time.Year;

public class Book {
  private String ISBN;
  private String title;
  private Year yearOfPublication;
 
  public Book(String ISBN, String title, Year yearOfPublication){
    setISBN(ISBN);
    setTitle(title);
    setYearOfPublication(yearOfPublication);
  }

  public void setISBN(String ISBN){
    this.ISBN = ISBN;
  }
  public String getISBN(){
    return ISBN;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public String getTitle(){
    return title;
  }
  public void setYearOfPublication(Year yearOfPublication){
    this.yearOfPublication = yearOfPublication;
  }

  @Override
  public String toString() {
    return "" + ISBN + " " + title + " " + yearOfPublication;
  }
}
