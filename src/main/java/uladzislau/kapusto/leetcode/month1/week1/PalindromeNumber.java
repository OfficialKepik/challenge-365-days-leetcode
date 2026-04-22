package uladzislau.kapusto.leetcode.month1.week1;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        char[] chars = ("" + x).toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(121));
        System.out.println(pn.isPalindrome(-121));
        System.out.println(pn.isPalindrome(10));
    }
}
