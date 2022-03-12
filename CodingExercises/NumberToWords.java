package CodingExercises;

public class NumberToWords {
    public static int getDigitCount(int num) {
        if(num<0)
            return -1;

        int count=0;
        do {
            count++;
            num/=10;
        }while(num!=0);
        return count;
    }

    public static int reverse(int num) {
        int rem=0, rev=0;
        while (num!=0) {
            rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        return rev;
    }

    public static void numberToWords(int number) {
        if(number<0) {
            System.out.println("Invalid Value");
            return;
        }
        int count=getDigitCount(number), rem=0;
        number=reverse(number);
        while(number!=0) {
            rem=number%10;
            switch (rem) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                default:
                    System.out.println("Nine");
                    break;
            }
            number/=10;
            count--;
        }
        while(count!=0) {
            System.out.println("Zero");
            count--;
        }
    }
}
