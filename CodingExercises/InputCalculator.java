package CodingExercises;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum=0, count=0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            if(sc.hasNextInt()) {
                sum+=sc.nextInt();
                count++;
            }
            else
                break;
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round((double) sum/count));
    }
}
