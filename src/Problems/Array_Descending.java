package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_Descending {
    private int anInt;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(descOrder(new int[]{6, 4, 7, 2, 9, 1}))); //[1, 2, 4, 6, 7, 9]
    }

    public static int[] descOrder(int[] arr) {
        int[] built = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            built[i]=arr[i];
        }
        return built;
    }

    public static List<Integer> sorted(List<Integer> numList) {
        return numList.stream().sorted().collect(Collectors.toList());
    }

}
