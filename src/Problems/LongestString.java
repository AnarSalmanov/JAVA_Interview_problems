package Problems;

import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        System.out.println(longest("bbbvvvcccccddrrrrsssggggeadhbdgjsfgnmfkk"));
    }

    public static String longest(String str) {
        String build = "";
        for (int i = 0; i < str.length() - 1; i++) {
            String temp = String.valueOf(str.charAt(i));
            if (str.charAt(i) != str.charAt(i + 1)) {
                temp = str.charAt(i) + ",";
            }
            build += temp;
        }
        build += str.charAt(str.length() - 1);
        String[] arr = build.split(",");
        int max = arr[0].length();
        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        String longest = "";
        for (String st : arr) {
            if (st.length() == max) {
                longest = st;
                break;
            }
        }
        return longest;
    }
}
