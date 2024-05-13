class A {
  public A() {
    System.out.println("in A");
  }

  public A(int n) {
    System.out.println("in int A");
  }
}

class B extends A {

  public B() {
    System.out.println("in B");
  }

  public B(int n) {
    super(n);
    System.out.println("in int B");
  }
}

public class Inhe {
  public static void main(String[] args) {
    B obj = new B(5);
  }
}