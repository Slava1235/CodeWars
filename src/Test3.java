public class Test3 {

    public static void main(String[] args) {
        long n = 1255l;
        System.out.println(Digits(n));
    }

    public static int Digits(long n) {
        String string = String.valueOf(n);
        char[] array = string.toCharArray();
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num++;
        }
        return num;
    }
}

