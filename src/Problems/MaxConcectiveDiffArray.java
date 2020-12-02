package Problems;

public class MaxConcectiveDiffArray {
    /**
     * Find maximum difference of array elements
     */

    public static int maxDiff(int[] num) {
        int maxDiff = 0;
        for (int i = 0; i < num.length - 1; i++) {
            int temp = Math.abs(num[i] - num[i + 1]);
            if (maxDiff < temp) {
                maxDiff = temp;
            }
        }
        return maxDiff;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{8, 84, 7, 81, 27, 32})); // 77
    }


}