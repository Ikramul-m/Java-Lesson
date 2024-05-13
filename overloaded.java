public class Overloaded {

  public static void main(String[] args) {

    int x = add(1, 2);
    System.out.println(x);

    int y = add(1, 2, 3);
    System.out.println(y);

    int z = add(1, 2, 3, 4);
    System.out.println(z);
  }

  static int add(int a, int b) {
    System.out.print("This is overloaded method #1: ");
    return a + b;
  }

  static int add(int a, int b, int c) {
    System.out.print("This is overloaded method #1: ");
    return a + b + c;
  }

  static int add(int a, int b, int c, int d) {
    System.out.print("This is overloaded method #1: ");
    return a + b + c + d;
  }
}
