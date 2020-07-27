package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorted {
    public static void main(String[] args) {
        System.out.println(sortingArrayList(Arrays.asList(new Integer [] {7,3,4,9,13,2}))); //[2, 3, 4, 7, 9, 13]
    }

    public static List<Integer> sorted(List<Integer> original) {
        Collections.sort(original);
        List<Integer> sorted = new ArrayList<>(original);
        return sorted;
    }


    public static List<Integer> sortingArrayList(List<Integer> list) {
        Integer[] arr = new Integer[list.size()];
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            arr[j] = list.get(i);
            j++;
        }
        Arrays.sort(arr);
        List<Integer> built = Arrays.asList(arr);
        return built;
    }


}
