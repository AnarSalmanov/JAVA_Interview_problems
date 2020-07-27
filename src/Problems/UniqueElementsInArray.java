package Problems;

import java.util.*;

public class UniqueElementsInArray {
    // MAIN METHOD
    public static void main(String[] args) {
        List<Integer> uniqueNumbers = uniqueNums(new Integer[]{2, 3, 2, 4, 4, 8, 9, 9, 4, 8, 10});
        System.out.println(uniqueNumbers); // 3, 10  in list
        System.out.println(Arrays.toString(uniqueValues(new int [] {1,1,2,2,3,4,5,3,4}))); //5
    }

    /**
     * Show only unique elements in array (never repeated)
     */
    public static List<Integer> uniqueNums(Integer[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer temp = arr[i];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        List<Integer> unique = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                unique.add(key);
            }
        }
        return unique;
    }

    // 2nd Way
    public static int[] uniqueValues(int[] arr) {
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

}