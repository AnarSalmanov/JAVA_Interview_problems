package Problems;


import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        int [] fibonacci = fibonacciSeries(10);
        System.out.println(Arrays.toString(fibonacci));
    }

/**
 * Give me n numbers series of fibonacci numbers
 */

public static int [] fibonacciSeries (int n){
    int [] fibonacciArray = new int [n];
    fibonacciArray[0] = 0;
    fibonacciArray[1]=1;
    for (int i =2 ;i<fibonacciArray.length ;i++){
        fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
    }
    return fibonacciArray;
}





}