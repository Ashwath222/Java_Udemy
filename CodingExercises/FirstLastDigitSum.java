package CodingExercises;

    public class FirstLastDigitSum {
        public static int sumFirstAndLastDigit(int number) {
            if(number<0)
                return -1;
            int sum=number%10,rem=0;
            while(number>0) {
                rem=number%10;
                number/=10;
            }
            sum+=rem;
            return sum;
        }
    }
