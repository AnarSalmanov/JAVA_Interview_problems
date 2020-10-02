package Problems;

public class PrimeNumber {

    /**
     * Find whether given number is prime or not
     */

    public static boolean isPrime(int num) {
        boolean result = true;
        if (num == 0 || num == 1) {
            result = false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + " - " + isPrime(i));
        }

    }


}