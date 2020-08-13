package Problems;

public class Min_Max_2dArray {
    /**
     * Find out min and max element in 2D int array
     */
    public static void minMax(int[][] arr) {
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                if (temp > max) {
                    max = temp;
                }
                if (temp < min) {
                    min = temp;
                }
            }
        }
        System.out.println("min :" + min);
        System.out.println("max :" + max);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        minMax(new int[][]{{7, 3, 6}, {21, 9, 8}, {12, 10, 4}});
        //3 ,21
    }


}