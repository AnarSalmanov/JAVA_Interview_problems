package Problems;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong(int num) {
        int n = num;
        int total = 0;
        while (n != 0) {
            int temp = n % 10;
            total += (temp * temp * temp);
            n /= 10;
        }
        return total == num;
    }
}
