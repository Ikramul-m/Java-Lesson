class Calculator {

  int a;

  public int add(int x, int y) {

    return x + y;

  }
}

public class Main {
  public static void main(String[] args) {

    int num1 = 4;
    int num2 = 5;

    Calculator calc = new Calculator();
    int result = calc.add(num1, num2);

    System.out.println("Result: " + result);
  }
}