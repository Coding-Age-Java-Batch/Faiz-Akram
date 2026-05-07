package Stringgg;
public class PalindromeCheck {
    public static boolean isPalindrome(String s) {
        String rev = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        String s = "madam";

        if(isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
