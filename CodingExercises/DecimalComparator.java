package CodingExercises;

//Program to check whether 2 nos are equal by 3 decimal places
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1 ,double num2){
        return (int)(num1*1000)==(int)(num2*1000)?true:false;// the multiplication can be done separately
    }
}
