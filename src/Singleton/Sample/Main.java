public class Main {
  public static void main(String[] args) {
    System.out.println("Start Program.");
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    if(s1 == s2) {
      System.out.println("Same instance.");
    } else {
      System.out.println("Different instance.");
    }
    System.out.println("End.");
  }
}
