package CodingExercises;

public class SumOddRange {
    public static boolean isOdd(int num) {
        if(num<=0)
            return false;
        return num%2!=0;
    }
    public static int sumOdd(int start, int end) {
        if(start>end || start<=0 || end<=0)
            return -1;
        int sum=0;
        for(int i=start;i<=end;i++) {
            sum+=isOdd(i)?i:0;
        }
        return sum;
    }
}
