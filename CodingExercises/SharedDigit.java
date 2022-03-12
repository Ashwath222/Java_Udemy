package CodingExercises;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1<=9 || num1>=100 || num2<=9 || num2>=100)
            return false;
        int rem1=0,rem2=0, temp=num2;
        while (num1>0) {
            rem1=num1%10;
            num2=temp;
            while(num2>0) {
                rem2=num2%10;
                if(rem1==rem2)
                    return true;
                num2/=10;
            }
            num1/=10;
        }
        return false;
    }
}
