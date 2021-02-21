package Problems;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class FrequencyOfCharacters {

    /**
     * Write a method to find frequency of chars in a String
     */
    public static Map<Character, Integer> frequencyOfChar(String str) {
        str = str.replace(" ", "").toLowerCase();
        Map<Character, Integer> frequencyOfChar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character temp = Character.valueOf(str.charAt(i));
            if (frequencyOfChar.containsKey(temp)) {
                frequencyOfChar.put(temp, frequencyOfChar.get(temp) + 1);
            } else {
                frequencyOfChar.put(temp, 1);
            }
        }
        return frequencyOfChar;
    }

    //MAIN METHOD
    public static void main(String[] args) {
//         System.out.println(frequencyOfChar("Life is wonderful").toString());
//          System.out.println(value("AAABBAABB")); //A5B4
//        System.out.println(frequency("Salmananov", 's')); //1
//        System.out.println(value("aaabbbcccdd"));
        System.out.println(repeated("AAABBAACCBBCCCS")); //A3B2A2C2B2
    }

    public static long frequency(String str, char ch) {
        List<Character> list = new ArrayList<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        return list.stream().filter(c -> c.equals(Character.valueOf(ch))).count();
    }

    public static String value(String str) {
        str = str.trim();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character temp = Character.valueOf(str.charAt(i));
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        return map.toString().replaceAll("\\W", "");
    }

    public static String repeated(String str) {
        String build = "";
        for (int i = 0; i < str.length() - 1; i++) {
            String temp = String.valueOf(str.charAt(i));
            if (str.charAt(i) != str.charAt(i + 1)) {
                temp = "" + str.charAt(i) + ",";
            }
            build += temp;
        }
        build += str.charAt(str.length() - 1);
        String[] arr = build.split(",");
        String last = "";
        for (String s : arr) {
            last += s.charAt(0) + "" + s.length();
        }
        return last;
    }


}