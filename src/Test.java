
import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
        String test = "One";
        String original = "neo";

        System.out.println(isAnagram(test, original));
    }

    public static boolean isAnagram(String test, String original) {
        // your code goes here
        char[] word1 = test.toLowerCase().replaceAll("[\\s]", " ").toCharArray();
        char[] word2 = original.toLowerCase().replaceAll("[\\s]", " ").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        if (Arrays.equals(word1, word2)) {
            return true;
        }

        return false;
    }
}
