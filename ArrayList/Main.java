import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(0);

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString());

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });

        System.out.print(numbers.toString());

        // char vowels[] = { 'u', 'i', 'o', 'e', 'a' };
        // Arrays.sort(vowels);
        // System.out.println(Arrays.toString(vowels));

        // char key = 'o';

        // int foundIndex = Arrays.binarySearch(vowels, 1, 4, key);

        // System.out.println(foundIndex);

    }
}