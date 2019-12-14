package interview.javabasics.String;

public class Palindrome2 {
    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        int length = str.length();
      //  System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Palindrome2.isPalindrome("welcome"));
        System.out.println(Palindrome2.isPalindrome("LOL"));

    }
}
