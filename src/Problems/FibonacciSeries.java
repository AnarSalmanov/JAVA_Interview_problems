package Problems;


import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        int[] fibonacci = fibonacciSeries(50);
        System.out.println(fibonacci[12]);
        System.out.println(Arrays.toString(fibonacci));

    }


    /**
     * Give me n numbers series of fibonacci numbers
     */

    public static int[] fibonacciSeries(int n) {
        int[] fibArray = new int[n];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i < n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        return fibArray;
    }


}