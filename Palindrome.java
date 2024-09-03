class Solution {
    public boolean isPalindrome(int n) {
        int x = n;
        int rev = 0;
        while(x > 0){
            int currentNum = x % 10;
            rev = rev * 10 + currentNum;
            x = x / 10;
        }
        return n == rev;
    }
}

