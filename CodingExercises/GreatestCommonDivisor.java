package CodingExercises;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if(num1<10 || num2<10)
            return -1;
        int temp;
        while(num2!=0) {
            temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }
}
