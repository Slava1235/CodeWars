
import java.util.Arrays;


public class Test {
    static String test = "One";
    static String original = "neo";

    public static void main(String[] args) {

        System.out.println(isAnagram(test, original));
    }

    public static boolean isAnagram(String test, String original) {
        // your code goes here
        char[] word = test.toLowerCase().replaceAll("[\\s]", " ").toCharArray();
        char[] word1 = original.toLowerCase().replaceAll("[\\s]", " ").toCharArray();
        Arrays.sort(word);
        Arrays.sort(word1);
        if (Arrays.equals(word, word1)) {
            return true;
        }
        return false;
    }
}
