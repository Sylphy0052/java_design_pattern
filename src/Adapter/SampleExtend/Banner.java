public class Banner {
  private String string;

  public Banner(String string) {
    this.string = string;
  }

  public void showwithParen() {
    System.out.println("(" + string + ")");
  }

  public void showWithAster() {
    System.out.println("*" + string + "*");
  }
}
