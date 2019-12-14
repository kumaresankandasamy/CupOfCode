package interview;

public class palindrome {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }
        int reverse = 0;
        int temp = x;
        while(temp > 0){
            reverse = 10*reverse + temp%10;
            temp /= 10;
        }
        return x== reverse;

    }
}