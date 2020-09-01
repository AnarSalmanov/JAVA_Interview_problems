package Problems;

public class Reverse_Integer {
    public static void main(String[] args) {
        System.out.println(reverseInt(123456));
    }

    public static int reverseInt(int n) {
        int rev = 0;
        while (n != 0) {
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }
        return rev;
    }
}
