public class StringDisplay extends AbstractDisplay {
  private String s;
  private int len;

  public StringDisplay(String s) {
    this.s = s;
    len = s.length();
  }

  public void open() {
    printLine();
  }

  public void print() {
    System.out.println("|" + s + "|");
  }

  public void close() {
    printLine();
    System.out.println("");
  }

  private void printLine() {
    System.out.print("+");
    for(int i = 0; i < len * 2; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }

}
