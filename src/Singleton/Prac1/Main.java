public class Main {
  public static void main(String[] args) {
    TicketMaker tm1 = TicketMaker.getInstance();
    TicketMaker tm2 = TicketMaker.getInstance();
    System.out.println(tm1.getNextTicketNumber());
    System.out.println(tm2.getNextTicketNumber());
  }
}
