package Problems;

public class MaxDifferenceInArray {
    /**
     * Find maximum difference of array elements
     */
    public static int maxDifference(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > max) {
                max = nums[i + 1] - nums[i];
            }
        }
        return max;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(maxDifference(new int[]{2, 3, 7, 81, 27, 32})); // 74
    }


}