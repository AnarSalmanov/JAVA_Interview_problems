package Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LargestPrime {


    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int largestPrime(List<Integer> numList) {
        List<Integer> primes = numList.stream().filter(n -> isPrime(n))
                .sorted().collect(Collectors.toList());
        LinkedList<Integer> linked = new LinkedList<>(primes);
        return linked.getLast();
    }

    public static void main(String[] args) {
        System.out.println(largestPrime(Arrays.asList(new Integer[]{23, 11, 19, 16, 17, 50})));
    }

}
