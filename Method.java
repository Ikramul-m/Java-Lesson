public class Method {

  public static void main(String[] args) {
    String name = "Ikramul";
    int age = 24;
    hello(name, age);
  }

  static void hello(String x, int a) {
    System.out.println("Hello " + x + "!");
    System.out.println("You are " + a + " years old.");
  }

}
