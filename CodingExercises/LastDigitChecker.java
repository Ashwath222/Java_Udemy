package CodingExercises;

public class LastDigitChecker {
    public static boolean isValid(int num) {
        return (num>=10 && num<=1000);
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3))
            return false;
        num1%=10;
        num2%=10;
        num3%=10;
        if(num1==num2 || num2==num3 || num3==num1)
            return true;
        return false;
    }
}
