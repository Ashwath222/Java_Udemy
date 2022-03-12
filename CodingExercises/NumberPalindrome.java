package CodingExercises;

//Program to heck whether palindrome
public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int rev=0, rem=0, num=number;
        while (number!=0) {
            rem=number%10;
            rev=(rev*10)+rem;
            number/=10;
        }
        return rev==num;
    }
}
