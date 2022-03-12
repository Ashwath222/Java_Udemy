package Challenges;

public class WhileTest {
    public static int sumDigits(int number) {
        if(number<10)
            return -1;
        int sum=0,rem=0;
        while(number>0) {
            rem=number%10;
            sum+=rem;
            number/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(128));
    }
}
