package idcard;
import framework.*;

public class IDCard extends Product {
  private String owner;
  private int serial;

  IDCard(String owner, int serial) {
    System.out.println("Create " + owner + "(" + serial + ")" + "'s IDcard.");
    this.owner = owner;
    this.serial = serial;
  }

  public void use() {
    System.out.println("Use " + owner + "(" + serial + ")" + "'s IDcard.");
  }

  public String getOwner() {
    return owner;
  }

  public int getSerial() {
    return serial;
  }
}
