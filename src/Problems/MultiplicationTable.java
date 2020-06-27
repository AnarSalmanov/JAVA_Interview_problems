package Problems;

public class MultiplicationTable {

    /**
     * Create a method which accepts 2 int  parameters
     * Multiply them without using multiplication.
     */

    public static int multiplication(int a, int b) {
        int total = 0;
        for (int i = 0; i < b; i++) {
            total += a;
        }
        return total;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(multiplication(7, 2));
    }

}