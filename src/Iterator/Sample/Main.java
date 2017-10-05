import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    List<String> bookNames = new ArrayList<>();
    bookNames.add("Around the World in 80 Days");
    bookNames.add("Bible");
    bookNames.add("Cinderella");
    bookNames.add("Daddy-Long-Legs");
    BookShelf bookShelf = new BookShelf(bookNames.size());
    for(String s : bookNames) {
      bookShelf.appendBook(new Book(s));
    }
    Iterator it = bookShelf.iterator();
    while(it.hasNext()) {
      Book book = (Book)it.next();
      System.out.println(book.getName());
    }
  }
}
