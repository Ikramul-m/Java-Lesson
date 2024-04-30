import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        char vowels[] = { 'e', 'a', 'o', 'u', 'i' };

        int start = 1;
        int end = 2;

        Arrays.sort(vowels, start, end);

        System.out.println(Arrays.toString(vowels));

    }
}