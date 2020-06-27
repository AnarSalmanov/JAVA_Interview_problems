package Problems;

public class Min_Max_2dArray {
    /**
     * Find out min and max element in 2D int array
     */
    public static void min_And_Max(int[][] nums) {
        int min = nums[0][0];
        int max = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
                if (nums[i][j] < min) {
                    min = nums[i][j];
                }
            }
        }
        System.out.println("min number is : " + min);
        System.out.println("max number is : " + max);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        min_And_Max(new int[][]{{7, 3, 6}, {21, 9, 8}, {12, 10, 4}});
        //3 ,21
    }


}