package CodingExercises;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number<0)
            return -1;
        int sum=0,rem=0;
        while (number>0) {
            rem=number%10;
            sum+=rem%2==0?rem:0;
            number/=10;
        }
        return sum;
    }
}
