package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong(int num) {
        String numToString = String.valueOf(num);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numToString.length(); i++) {
            list.add(Character.getNumericValue(numToString.charAt(i)));
        }
        int sum = 0;
        for (Integer number : list) {
            int tempCube = number * number * number;
            sum += tempCube;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
