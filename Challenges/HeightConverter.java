package Challenges;

//program to convert feet and inches to cms
public class HeightConverter {
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet<0 || inches<0 || inches>12)
            return -1;
        return ((feet*12)+inches)*2.54;
    }
    public static double calcFeetAndInchesToCentimeters(int inches) {
        if(inches<0)
            return -1;
        return calcFeetAndInchesToCentimeters(inches/12,inches%12);
    }
    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(1345));
    }
}
