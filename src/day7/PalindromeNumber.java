package day7;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x<0 ||(x%10 == 0 && x!=0)){
            return false;
        }
        int reversedHalf =0;
        while (x>reversedHalf){
            reversedHalf = reversedHalf*10 + x%10;
            x/=10;
        }
        //even number of digits: x==reversedHalf
        //odd number og digits:x==reversedHalf/10
        return x==reversedHalf||x==reversedHalf/10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1221));
    }
}
