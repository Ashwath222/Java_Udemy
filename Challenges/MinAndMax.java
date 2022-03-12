package Challenges;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args){
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers");
        while(true) {
            if(sc.hasNextInt()) {
                num= sc.nextInt();
                if(num>max)
                    max=num;
                if(num<min)
                    min=num;
            }
            else
                break;
        }
        System.out.println("Maximum = "+max+"\nMinimum = "+min);
    }
}
