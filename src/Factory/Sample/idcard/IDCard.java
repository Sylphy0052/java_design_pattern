package idcard;
import framework.*;

public class IDCard extends Product {
  private String owner;

  IDCard(String owner) {
    System.out.println("Create " + owner + "'s IDcard.");
    this.owner = owner;
  }

  public void use() {
    System.out.println("Use " + owner + "'s IDcard.");
  }

  public String getOwner() {
    return owner;
  }
}
