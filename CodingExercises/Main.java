package CodingExercises;

public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConversion(1.5);// testing the speed converter
        MegaBytesConverter.printMegaBytesAndKiloBytes(8600);// testing the megabyte converter
        System.out.println(BarkingDog.shouldWakeUp(true,16));//testing whether the dog should be woken up
        System.out.println(LeapYear.isLeapYear(2000));//testing whether leap year
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.13456,2.134021));//testing the decimal comparator
        System.out.println(EqualSumChecker.hasEqualSum(10,-20,-10));//testing the equal sum checker
        System.out.println(TeenNumberChecker.hasTeen(10,21,15));//testing the teen number checker
        MinutesToYearsDaysCalculator.printYearsAndDays(76000);
        IntEqualityPrinter.printEqual(12,34,13);
        System.out.println(PlayingCat.isCatPlaying(true, 44));
    }
}
