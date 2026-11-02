import java.util.Locale;
import java.util.Scanner;

public class TobyTo {

    public static void main() {

        int a = 5;
        String b = "Java is best";
        System.out.println(isEven(5));
        System.out.println(reverseWords(b));
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singletonNumber(nums));
        System.out.println(isPalindrome(b));

    }

    public static boolean isEven(int num) {
        return (num & 1) == 0;
    }

    public static String reverseWords(String str) {
        return String.join(" ", java.util.Arrays.asList(str.split("\\s+")).reversed());
    }

    public static int singletonNumber(int[] numbers) {
        int num = numbers[0];
        for (int i = 1; i == numbers.length - 1; i++) {

            if ((num ^ numbers[i]) == 0) {
                num = numbers[i];
            }
        }
        return num;
    }


    public static boolean isPalindrome(String s) {
       // java.lang.String = new StringBuilder(s).reverse().toString();
        return s.contentEquals(new StringBuilder(s).reverse());
    }

}
