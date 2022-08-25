public class Book {
  private String title;
  private int releaseYear;
  private int ISBN;

  Book (String title, int releaseYear, int ISBN){
    this.title = title;
    this.releaseYear = releaseYear;
    this.ISBN = ISBN;

  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public int getISBN() {
    return ISBN;
  }

  public void setISBN(int ISBN) {
    this.ISBN = ISBN;
  }


  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", releaseYear=" + releaseYear +
        ", ISBN=" + ISBN +
        '}';
  }
}

