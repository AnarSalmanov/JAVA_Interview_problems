package Problems;

import java.util.*;

public class Vishal {
    /**
     * if numbers are repeating  222345555
     */

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>(Arrays.asList(new String[] {"Anar","Vishal"}));
        Object[] namesArr = namesList.toArray();
        int [] arr = {3,5,6,7,8,};
        Object [] obj = {"Anar","Vishal",4,3.6};
        System.out.println(Arrays.toString(obj));
       // System.out.println(Arrays.toString(namesArr));
        String [] anotherArr = {"Vishal", "Anar"};
        List<String> another = Arrays.asList(anotherArr);
        //System.out.println(another);

    }

    // List only can be converted to Object[]
    public static Map<Character, Integer> frequency(Integer num) {
        String numToStr = String.valueOf(num);// Wrapper class -> primitives to Object
        char[] strTroChar = numToStr.toCharArray(); // to char array
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strTroChar.length; i++) {
            Character temp = strTroChar[i];
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        return map;
    }
}
