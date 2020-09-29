package Problems;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        System.out.println(isArmstrong(153));
//        System.out.println(Arrays.toString(descendingOrder(new int[]{1, 2, 3, 4, 5})));
//        System.out.println(sortedList(Arrays.asList(new Integer[]{5, 4, 3, 2, 1})));
//        System.out.println(sameIndex(new int[]{1, 3, 5, 9}, new int[]{1, 5, 8, 9}));
//        System.out.println(Arrays.toString(fibonacciSeries(10)));
//        System.out.println(frequencyOfChar("Amazon", 'a'));
//        System.out.println(maxConsecutiveArray(new int[]{10, 20, 35, 70, 15, 10}));
//        System.out.println(Arrays.toString(minMaxOf2DArray(new int[][]{{1, 2, 3}, {4, 5, 10}, {7, 20, 13}})));
//        System.out.println(placeZeroToTheEnd(Arrays.asList(new Integer[]{1, 0, 2, 0, 3, 0, 53, 0, 34, 7})));
//        System.out.println(isPrime(6));
//        pyramidIncrease(10);
//        pyramidDecrease(10);
//        System.out.println(reverseInteger(456));
//        System.out.println(isPalindrome("KaBacok"));\
//        System.out.println(sumOfArray(new int[]{1, 2, 4, 6}));
//        swapVariables(10, 20);
//        System.out.println(Arrays.toString(distinctValues(new int[]{1, 1, 2, 2, 3, 3, 4})));
//        System.out.println(Arrays.toString(distinctValues(new char[]{'a', 'a', 'b', 'b', 'c', 'c'})));
//        System.out.println(uniqueElementsList(Arrays.asList(new Integer[]{1, 1, 2, 2, 3, 3, 4, 4})));
        System.out.println(Arrays.toString(uniqueElementsArray(Arrays.asList(new Integer[]{1, 1, 2, 2, 3, 3, 4, 4}))));
    }

    public static boolean isArmstrong(int num) {
        int n = num;
        int total = 0;
        while (n != 0) {
            int temp = n % 10;
            total += temp * temp * temp;
            n /= 10;
        }
        return total == num;
    }

    public static int[] descendingOrder(int[] num) {
        int[] descending = new int[num.length];
        int j = 0;
        Arrays.sort(num);
        for (int i = num.length - 1; i >= 0; i--) {
            descending[j] = num[i];
            j++;
        }
        return descending;
    }

    public static List<Integer> sortedList(List<Integer> numList) {
        return numList.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> sameIndex(int[] arr1, int[] arr2) {
        ArrayList<Integer> matchingIndex = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i])
                matchingIndex.add(i);
        }
        return matchingIndex;
    }

    public static int[] fibonacciSeries(int num) {
        int[] fib = new int[num];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int frequencyOfChar(String str, char ch) {
        int k = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                k++;
            }
        }
        return k;
    }

    public static int maxConsecutiveArray(int[] num) {
        int max = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if (Math.abs(num[i] - num[i + 1]) > max) {
                max = Math.abs(num[i] - num[i + 1]);
            }
        }
        return max;
    }

    public static int[] minMaxOf2DArray(int[][] arr) {
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                if (temp < min) {
                    min = temp;
                }
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return new int[]{min, max};
    }

    public static List<Integer> placeZeroToTheEnd(List<Integer> numList) {
        List<Integer> built = new ArrayList<>();
        int k = 0;
        for (Integer n : numList) {
            if (n == 0) {
                k++;
                continue;
            }
            built.add(n);
        }
        for (int i = 0; i < k; i++) {
            built.add(0);
        }
        return built;
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void pyramidIncrease(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pyramidDecrease(int num) {
        for (int i = num; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            return true;
        }
        return false;
    }

    public static int sumOfArray(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void swapVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a =" + a + " b =" + b);
    }

    public static int[] distinctValues(int[] num) {
        List<Integer> built = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            built.add(num[i]);
        }
        return built.stream().distinct().mapToInt(n -> n).toArray();
    }

    public static char[] distinctValues(char[] values) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < values.length; i++) {
            set.add(Character.valueOf(values[i]));
        }
        char[] distinct = new char[set.size()];
        Iterator<Character> it = set.iterator();
        int j = 0;
        while (it.hasNext()) {
            distinct[j] = it.next();
            j++;
        }
        return distinct;
    }

    public static List<Integer> uniqueElementsList(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static int[] uniqueElementsArray(List<Integer> list) {
        return list.stream().distinct().mapToInt(n -> n).toArray();
    }
}
