package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// replaceAll("([a-zA-Z])\\1+", "$1") - pppooppeeyyee -> popeye  (only letters)
// replaceAll("\\W", "") - removes all special characters except _ underscore
// replaceAll("\\d" ,"") - removes all digits in String
// replaceAll("\\D" ,"") - keeps only digits in String
// replaceAll("\\s+"," ") - removes extra spaces between words in String and keeps only 1.
public class ReplaceAll_Regex {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(built(new String[]{"Elvin", "Xezer", "Samir","Anar"})));
//        System.out.println(Arrays.toString(sort(Arrays.asList(new Integer[]{55, 32, 1, 60, 77}))));
        System.out.println(valid("pppppoooppeeeyyee"));
//        System.out.println(volume(new int []{1,2,3,4,5}));
//        System.out.println(factorial(5));
//        System.out.println(onlyAlphabetical("123Anar_=-Salmanov?}"));

    }

    public static int[] sort(List<Integer> list) {
        return list.stream().sorted().mapToInt(n -> n).toArray();
    }

    public static String[] built(String[] names) {
        List<String> name = Arrays.asList(names);
        return name.stream().sorted().map(n -> n).toArray(String[]::new);
    }

    public static String valid(String str) {
        return str.replaceAll("([a-zA-Z])\\1+", "$1");
    }

    public static int volume(int[] arr) {
        int total = 1;
        for (int i = 0; i < arr.length; i++) {
            total *= arr[i];
        }
        return total;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    public static String onlyAlphabetical(String str) {
        return str
                .replaceAll("\\d", "") //remove all digits
                .replaceAll("\\W", "") // remove all characters except _
                .replace("_", "") // remove _
                .replaceAll("", "");
    }
}
