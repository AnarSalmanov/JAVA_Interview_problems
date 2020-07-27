package Problems;

import java.util.*;

public class Old_interviews {
    public static void main(String[] args) {
        String word = "Xosemi";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);
        oddNumbers(100);
        evenNumbers(50);
        fizbuzz(100);
        System.out.println(reverseAllWordsInString(" Hi My Dear")); // iH yM raeD
        System.out.println(fibonachiSeriesWithList(50));
        System.out.println(Arrays.toString(findFibonachiSeriesWithArray(50)));
        System.out.println("23 is prime ? : " + isPrimeOrNot(23)); // true
        System.out.println(factorial(5)); // 120
        System.out.println(build("1 5 3 7 3 1 1 1 7 2 9 2 9 15 23 23 99 90"));
        System.out.println(frequency("AAAABBBCDDEE"));
        System.out.println(freguencyMap("AAAABBBCDDEE"));
        // onlyUnique(new int [] {1,1,1,2,3,2,4,5,6,7,8,9});
        onlyUnique2(new Integer[]{1, 1, 1, 2, 3, 2, 4, 5, 6, 7, 8, 9});

    }

    /**
     * Odd numbers
     */
    public static void oddNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Even numbers
     */
    public static void evenNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Count from 1-30 with fizzbuz principe
     */
    public static void fizbuzz(int a) {
        for (int i = 1; i <= a; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " fizbuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Reverse all strings of String
     */
    public static String reverseAllWordsInString(String str) {
        String wordsReversed = "";
        String[] words = str.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String wordReversed = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                wordReversed += word.charAt(j);
            }
            wordsReversed += wordReversed + " ";
        }
        return wordsReversed;
    }

    /**
     * Fibonachi series with List
     */
    public static List<Integer> fibonachiSeriesWithList(int num) {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        for (int i = 2; i < num; i++) {
            serie.add(serie.get(i - 1) + serie.get(i - 2));
        }
        return serie;
    }

    /**
     * Fibonachi series with Array
     */
    public static int[] findFibonachiSeriesWithArray(int n) {
        int[] nums = new int[n];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums;
    }

    /**
     * Prime or not
     */
    public static boolean isPrimeOrNot(int num) {
        if (num == 1) {
            return false;
        }
        if ((num * num - 1) % 24 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Factorial of number
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    /**
     * Occurance of element in String/Array
     */
    public static Map<String, Integer> build(String str) {
        String[] arr = str.trim().split(" ");
        HashMap<String, Integer> stringCountMap = new HashMap<>();
        for (String s : arr) {
            if (stringCountMap.containsKey(s)) {
                stringCountMap.put(s, stringCountMap.get(s) + 1);
            } else {
                stringCountMap.put(s, 1);
            }
        }
        return stringCountMap;
    }

    public static String frequency(String str) {
        // String str = "AABBBCCCDDD" => A2B3C3D3E
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i, i + 1) + "" + count;
            }
        }
        return result;
    }

    // frequency with map
    public static String freguencyMap(String word) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (frequency.containsKey(temp)) {
                frequency.put(temp, frequency.get(temp) + 1);
            } else {
                frequency.put(temp, 1);
            }
        }
        return frequency.toString().replace("=", "").replace("{", "").replace("}", "").replace(",", "").replace(" ",
                "");
    }

    /**
     * GIVE ME ONLY NOT REPEATED NUMBERS (UNIQUE)
     */
    public static void onlyUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate == false) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Unique numbers only
    public static void onlyUnique2(Integer[] arr) {
        Map<Integer, Integer> unique = new HashMap<>();
        for (Integer num : arr) {
            if (unique.containsKey(num)) {
                unique.put(num, unique.get(num) + 1);
            } else {
                unique.put(num, 1);
            }
        }
        System.out.println(unique.toString());
        for (Integer key : unique.keySet()) {
            if (unique.get(key) == 1) {
                System.out.println(key + " is unique");
            }

        }

    }
}