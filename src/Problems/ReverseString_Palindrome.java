package Problems;

public class ReverseString_Palindrome {
    /**
     * Crate a method to reverse given String
     * Check if it is palindrome or not
     */
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)) {
            return true;
        }
        return false;
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println(isPalindrome("kabak")); //true
        System.out.println(isPalindrome("apple")); //false
    }


}