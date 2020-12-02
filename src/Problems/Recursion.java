package Problems;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(printNums(10));
    }

    // recursion
    public static int printNums(int num) {
        if (num == 0) {
            return 0;
        }
        System.out.println(num);
        return printNums(num - 1);
    }
}