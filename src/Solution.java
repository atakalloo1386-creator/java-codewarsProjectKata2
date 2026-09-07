public class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reverse = 0;
        while (x > 0) {
            int remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x / 10;
        }

        // for palindrome
        if (reverse == temp) {
           return true;
        } else {
            return false;
        }
    }
}



