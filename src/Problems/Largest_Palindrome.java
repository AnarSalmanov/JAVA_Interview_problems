package Problems;

import java.util.*;

public class Largest_Palindrome {

    public static void main(String[] args) {
        System.out.println(largestPalindrome(new String[]{"madam", "kabak", "madddam", "kabbbak"}));

    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static String largestPalindrome(String[] arr) {
        if (arr.length == 0) {
            return "";
        }
        Map<Integer,String> map = new HashMap<>();
        for(String s: arr){
            if(isPalindrome(s)){
                map.put(s.length(),s);
            }
        }
        int max=0;
        for(Integer i : map.keySet()){
            if(i>max){
                max=i;
            }
        }
        return map.get(max);
    }
}
