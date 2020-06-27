package Problems;

public class OccurrenceOfGivenChar {

    /**
     * Find given char occurrence in given String
     */
    public static int occurrenceOfChar(char a, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(occurrenceOfChar('k', "xoxlushka")); // 1
    }

}