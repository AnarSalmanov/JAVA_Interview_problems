package Problems;


import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries(8))); // whole array
        System.out.println(nthFib(2)); //21
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

    /*
     Give me nth fibonacci number
     */
    public static int nthFib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] fibArray = new int[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[i - 2] + fibArray[i - 1];
        }
        return fibArray[n];
    }

}