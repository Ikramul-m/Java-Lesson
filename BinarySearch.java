import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        Arrays.sort(vowels);

        char key = 'i';

        int foundItemIndex = Arrays.binarySearch(vowels, key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(foundItemIndex);
    }
}
