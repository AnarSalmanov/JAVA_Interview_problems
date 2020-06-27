package Problems;

public class SumOfArray {

    /**
     * Create a method to count sum of array elements
     */
    public static int sumOfArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1, 2, 4, 5, 6}));  //18
    }
}