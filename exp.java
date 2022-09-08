
public class exp {

    public static void main(String[] args) {
        System.out.println(isPalindrome(122));// returns false
    }

    public static boolean isPalindrome(int x) {

        // boolean is_Palindrome = false;

        int digit = 0;
        int ans = x;
        int reversed = 0;

        // number has been reversed
        while (x != 0) {
            digit = x % 10;
            reversed = (reversed * 10) + digit;
            x /= 10;
        }

        if (ans == reversed) {
            return true;
        } else
            return false;

    }

}
