public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    // Title
    builder.makeTitle("Greeting");
    // String
    builder.makeString("From morning to noon");
    // Itemization
    builder.makeItems(new String[] {
      "Good morning.",
      "Hello.",
    });
    builder.makeString("At night");
    builder.makeItems(new String[] {
      "Good evening.",
      "Good night",
      "Good bye",
    });
    // complete
    builder.close();
  }
}
