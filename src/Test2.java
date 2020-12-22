import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String str = "sdfsdgsawqee";
        System.out.println(getCount(str));
    }

    //   a , e, i, o, u
    public static int getCount(String str) {
//        int vowelsCount = str.indexOf("a");
//        int vowelsCount2 = str.indexOf("e");
//        int vowelsCount3 = str.indexOf("i");
//        int vowelsCount4 = str.indexOf("o");
//        int vowelsCount5 = str.indexOf("u");
        String text = "a";
        String text2 = "e";
        String text3 = "i";
        String text4 = "o";
        String text5 = "u";
        long count = Arrays.stream(str.split("\\s")).filter(text::equals).count();


        return (int) count;
    }
}

