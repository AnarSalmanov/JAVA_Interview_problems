package Problems;

import java.util.Arrays;

public class Array_Descending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(descOrder(new int[]{6, 4, 7, 2, 9, 1}))); //[1, 2, 4, 6, 7, 9]
    }

    public static int[] descOrder(int[] arr) {
        int[] built = new int[arr.length];
        Arrays.sort(arr);
        int j = 0;
        for (int i = arr.length-1; i >=0; i--) {
            built[j] = arr[i];
            j++;
        }
        return built;
    }
}
