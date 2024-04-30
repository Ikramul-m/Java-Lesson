import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        Arrays.sort(vowels);

        int start = 1;
        int end = 4;

        char key = 'i';

        int foundItemIndex = Arrays.binarySearch(vowels, start, end, key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(foundItemIndex);
    }
}
