package CodingExercises;

//Program to check whether the given ages are teen ages are not
public class TeenNumberChecker {
    public static boolean isTeen(int num){
        if(num>=13 && num<=19)
            return true;
        return false;
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        if(!isTeen(num1))
            if(!isTeen(num2))
                if(!isTeen(num3))
                    return false;
        return true;
    }
}
