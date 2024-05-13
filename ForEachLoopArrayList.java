import java.util.ArrayList;

public class ForEachLoopArrayList {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("snake");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
