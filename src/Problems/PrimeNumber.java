package Problems;

public class PrimeNumber {

    /**
     * Find whether given number is prime or not
     */
    public static void main(String[] args) {
        System.out.println(largestPrime(50)); //47
        System.out.println(isPrime(-3));
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int largestPrime(int n) {
        int largest = 0;
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                if (i > largest) {
                    largest = i;
                }
            }
        }
        return largest;
    }

}