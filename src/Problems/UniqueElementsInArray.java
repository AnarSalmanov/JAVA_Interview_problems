package Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElementsInArray {
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

    // MAIN METHOD
    public static void main(String[] args) {
        List<Integer> uniqueNumbers = uniqueNums(new Integer[]{2, 3, 2, 4, 4, 8, 9, 9, 4, 8, 10});
        System.out.println(uniqueNumbers); // 3, 10  in list
    }

}