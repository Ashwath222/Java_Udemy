package CodingExercises;

//Program to convert minutes to years and days
public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0) {
            System.out.println("Invalid Value");
            return;
        }
        long days=minutes/(60*24) ,years=days/365;
        days%=365;
        System.out.println(minutes+" min = "+years+" y and "+days+" d");
    }
}
