package Problems;

public class Factorial {

    public static void main(String[] args) {
//        System.out.println(factorial(5));//120
//        System.out.println(factorial(0)); //1
        System.out.println(factorial2(5));
    }


    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static int factorial2(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial2(num - 1);
    }
}
