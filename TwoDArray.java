import java.util.ArrayList;

public class TwoDArray {
  public static void main(String[] args) {

    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

    ArrayList<String> bakeryList = new ArrayList<String>();
    bakeryList.add("pizza");
    bakeryList.add("hamburger");
    bakeryList.add("hotdog");

    ArrayList<String> produceList = new ArrayList<String>();
    produceList.add("tomatoes");
    produceList.add("bread");
    produceList.add("peppers");

    ArrayList<String> drinkList = new ArrayList<String>();
    drinkList.add("soda");
    drinkList.add("coffee");
    drinkList.add("milk");

    // Add the lists to groceryList
    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinkList);

    // Now you can access elements from groceryList
    System.out.println(groceryList.get(2).get(1)); // This will print "coffee"
  }
}
