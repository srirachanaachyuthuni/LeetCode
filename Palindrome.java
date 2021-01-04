public class Palindrome {
    public static boolean palindrome(int n){
        if ((n < 0) || (n%10==0 && n!=0)){
            return false;
        }
        int reversedNum = 0;
        int lastDigit;
        while(n > reversedNum){
            lastDigit = n % 10;
            reversedNum = (reversedNum * 10) + lastDigit;
            n = n / 10;
        }
        return (n == reversedNum) || (n == reversedNum/10);
    }
    public static void main(String[] args){
        System.out.println("The number is a palindrome?: " + palindrome(2332));
    }
}
