package Problems;

public class Heavy {
    public static void main(String[] args) {
//        prob_1(5);
//        prob_2(5);
        prob_3(5);
    }

    /**
     * ----------- prob_1
     * Draw this:
     * 1****
     * 12***
     * 123**
     * 1234*
     * 12345
     */

    public static void prob_1(int n) {
        for (int i = 1; i <= n; i++) {   // rows
            for (int j = 1; j <= i; j++) { // column
                System.out.print(j);  // print digit
            }
            for (int k = n; k > i; k--) { // column
                System.out.print("*");  // print * add to digit
            }
            System.out.println();
        }
    }

    /**
     * ----------- prob_2
     * Draw this:
     * 1234&
     * 123&&
     * 12&&&
     * 1&&&&
     * &&&&&
     */

    public static void prob_2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = n; k >= i; k--) {
                System.out.print("&");
            }
            System.out.println();
        }
    }

    /**
     * ----------- prob_3
     * Draw this:
     *
     * @
     * @ @
     * @ @
     * @ @
     * @ @ @ @
     */
    public static void prob_3(int n) {
        System.out.println("@");
        for (int i = n; i >= 1; i--) {
            System.out.print("@");
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("@");
        }
        System.out.println("@ @ @ @ @");
    }


}
