import java.util.List;
import java.util.ArrayList;

public class BookShelf implements Aggregate {
  private List books;
  // private int last = 0;

  public BookShelf(int size) {
    this.books = new ArrayList(size);
  }

  public Book getBookAt(int index) {
    return (Book)books.get(index);
  }

  public void appendBook(Book book) {
    this.books.add(book);
    // last++;
  }

  public int getLength() {
    // return last;
    return books.size();
  }

  public Iterator iterator() {
    return new BookShelfIterator(this);
  }
}
