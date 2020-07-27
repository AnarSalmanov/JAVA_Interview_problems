package Problems;

public class SwapVariablesWithoutTemp {
    /**
     * Create a method and swap given 2 integers without using temp variable
     */
    public static void swapVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }

    //MAIN METHOD
    public static void main(String[] args) {
        swapVariables(5, 10);
        //a is : 10
        //b is : 5
    }
}