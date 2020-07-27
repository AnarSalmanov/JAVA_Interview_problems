package Problems;

public class Reverse_Integer {
    public static void main(String[] args) {
        System.out.println(reverseInt(123456));
    }

    public static int reverseInt(int num) {
        int rev = 0;
        while (num != 0) {
            int temp = num % 10;
            rev = rev * 10 + temp;
            num /= 10;
        }
        return rev;
    }
}
