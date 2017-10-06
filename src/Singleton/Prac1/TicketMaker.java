public class TicketMaker {
  private int ticket = 1000;
  private static TicketMaker tm = new TicketMaker();

  private TicketMaker() {
  }

  public static TicketMaker getInstance() {
    return tm;
  }

  public synchronized int getNextTicketNumber() {
    return ticket++;
  }
}
