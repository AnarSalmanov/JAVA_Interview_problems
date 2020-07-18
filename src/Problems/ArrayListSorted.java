package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorted {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(new Integer [] {9,5,3,6,8,4,2}));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

    public static List<Integer> sorted(List<Integer> original) {
        Collections.sort(original);
        List<Integer> sorted = new ArrayList<>(original);
        return sorted;
    }
    public static List<Integer> sorted2(List<Integer> original) {
        Collections.sort(original);
        List<Integer> sorted = new ArrayList<>(original);
        return sorted;
    }

    public static void SortingArrayListAsc(List<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }


}
