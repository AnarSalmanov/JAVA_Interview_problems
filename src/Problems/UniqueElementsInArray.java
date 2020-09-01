package Problems;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElementsInArray {

    public static void main(String[] args) {
        System.out.println(notRepeted2(new int[]{2, 3, 2, 4, 4, 8, 9, 9, 4, 8, 10})); // 3, 10
        System.out.println(Arrays.toString(notRepeated(new int[]{1, 1, 2, 2, 3, 4, 5, 3, 4}))); //5
        System.out.println(Arrays.toString(unique(new int[]{1, 1, 3, 3, 2, 2, 5, 5, 6, 7, 7, 9, 9})));
        //[1, 3, 2, 5, 6, 7, 9]
    }

    /**
     * Show only unique elements in array (never repeated)
     */
    public static List<Integer> notRepeted2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer temp = Integer.valueOf(arr[i]);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        List<Integer> notRepeated = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                notRepeated.add(key);
            }
        }
        return notRepeated;
    }

    // 2nd Way
    public static int[] notRepeated(int[] arr) {
        int count = 0;
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    duplicate = true;
                }
            }
            if (duplicate == false) {
                uniqueList.add(arr[i]);
            }
        }
        int k = 0;
        int[] onlyUniques = new int[uniqueList.size()];
        for (Integer num : uniqueList) {
            onlyUniques[k] = num;
            k++;
        }
        return onlyUniques;
    }


    public static int[] unique(int[] nums) {
        List<Integer> initial = new ArrayList<>();
        for (Integer n : nums) {
            initial.add(Integer.valueOf(n));
        }
        return initial.stream().distinct().mapToInt(i -> i).toArray();
    }
}