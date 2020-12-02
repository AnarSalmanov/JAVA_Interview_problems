package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_Descending {
    private int anInt;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(descOrder(new int[]{6, 4, 7, 2, 9, 1}))); //[9, 7, 6, 4, 2, 1]
    }

    public static int[]descOrder (int[]num){
        Arrays.sort(num);
        int []built = new int[num.length];
        int j=0;
        for (int i=num.length-1; i>=0 ; i--){
            built[j]=num[i];
            j++;
        }
        return built;
    }

    public static List<Integer> sorted(List<Integer> numList) {
        return numList.stream().sorted().collect(Collectors.toList());
    }

}
