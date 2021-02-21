package Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(desc(new int [] {5,2,9,17,3})));
//        System.out.println(reversed("XoseMariaGarsiaAranda"));
        System.out.println(reversed("XoseMariaGarsiaAranda"));
    }

    //Arrays descending
    public static int[] desc(int[] arr) {
        List<Integer> list = new LinkedList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list.stream().sorted().mapToInt(n -> n).toArray();
    }

    public static String reversed  (String str) {
        String build = "";
        for (int i=str.length()-1; i>=0; i--){
            build+=str.charAt(i);
        }
        return build;
    }

}
