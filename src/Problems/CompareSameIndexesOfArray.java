package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareSameIndexesOfArray {

    /**
     * Create a method which returns array and parameters are 2 arrays.
     * Compare 2 arrays elements in same index, if they are matching then create
     * another array and add those values to that array Note:
     * Arrays should be same length
     * Note: Here we will return Object array in order to be able to convert List to array
     */
    public static Object[] matchedValues(int[] a, int[] b) {
        List<Integer> matchedValues = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                matchedValues.add(a[i]);
            }
        }
        return matchedValues.toArray();
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(Arrays.toString(matchedValues(new int[]{3, 6, 7, 8}, new int[]{3, 6, 5, 8})));
    }

}
