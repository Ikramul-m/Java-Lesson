import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);

    System.out.println(numbers.get(2));
    numbers.remove(2);

    numbers.set(2,90);
    System.out.println(numbers.toString());
  }
}
