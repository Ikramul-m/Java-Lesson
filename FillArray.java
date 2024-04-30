import java.util.Arrays;

class FillArray {
    public static void main(String[] args) {

        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

        Arrays.sort(vowels);

        int start = 1;
        int end = 4;

        Arrays.fill(vowels, start, end, 'x');

        System.out.println(Arrays.toString(vowels));

    }
}
