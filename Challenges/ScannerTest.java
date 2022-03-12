package Challenges;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;) {
            if(sc.hasNextInt()) {
                sum+=sc.nextInt();
                i++;
            }
            else {
                System.out.println("Cannot parse Input. Re-enter number");
                sc.nextLine();
            }
        }
        System.out.println("Sum = "+sum);
    }
}
