package Problems;

public class PrimeNumber {
    /**
     * Find whether given number is prime or not
     */
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if ((n * n - 1) % 24 == 0) {
            return true;
        }
        return false;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(isPrime(1)); // false
        System.out.println(isPrime(13)); // true
        System.out.println(isPrime(11)); // true

    }


}