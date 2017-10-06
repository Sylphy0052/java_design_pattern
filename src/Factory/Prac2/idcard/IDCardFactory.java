package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
  // private List<String> owners = new ArrayList<String>();
  private AbstractMap<Integer, String> database = new HashMap<Integer, String>();
  private int serial = 100;

  protected synchronized Product createProduct(String owner) {
    return new IDCard(owner, serial++);
  }

  protected void registerProduct(Product product) {
    // owners.add(((IDCard)product).getOwner());
    IDCard card = (IDCard)product;
    database.put(new Integer(card.getSerial()), card.getOwner());
  }

  public AbstractMap getOwners() {
    return database;
  }
}
