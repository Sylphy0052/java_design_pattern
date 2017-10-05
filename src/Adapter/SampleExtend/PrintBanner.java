public class PrintBanner extends Banner implements Print {
  public PrintBanner(String string) {
    super(string);
  }

  public void printWeak() {
    showwithParen();
  }

  public void printStrong() {
    showWithAster();
  }
}
