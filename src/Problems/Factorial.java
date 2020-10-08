package Problems;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialOfNum(5));
        System.out.println(factorialOfNum(0));
    }

    public static int factorialOfNum(int num) {
        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = 1; i <= num; i++)
            total *= i;
        return total;
    }
}
