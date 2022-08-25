import java.util.ArrayList;

public class Library {
  private Book book;
  ArrayList<Book> libraryBooks = new ArrayList<>();

  public void setLibraryBooks(Book book) {
    this.libraryBooks.add(book);
  }

  public ArrayList<Book> getLibraryBooks() {
    return libraryBooks;
  }

  public static void main(String[] args) {
    Book book1 = new Book("ondskaben", 2020, 123);
    Book book2 = new Book("Mandagen", 2015, 345);
    Book book3 = new Book("backToSchool", 2010, 987);

    Library library = new Library();
    library.setLibraryBooks(book1);
    library.setLibraryBooks(book2);
    library.setLibraryBooks(book3);

    System.out.println(library.getLibraryBooks());

    }
  }
