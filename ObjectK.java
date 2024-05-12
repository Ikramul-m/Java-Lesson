class Mobile {

  String brand;
  int price;
  String name;

  public void show() {
    System.out.println("Brand: " + brand + " || " + " Price: " + price + " || " + " Name: " + name);
  }
}

public class Objectk {
  public static void main(String[] args) {

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 20000;
    obj1.name = "iPhone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 10000;
    obj2.name = "Galaxy";

    obj1.show();
    obj2.show();
  }
}
