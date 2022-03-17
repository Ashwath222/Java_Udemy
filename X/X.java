package com.X;

import java.util.Scanner;

public class X {
    private int x;

    public X() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number");
        this.x = x.nextInt();
        x();
    }

    public void x() {

        for(int x = 1; x <= 12; x++)
            System.out.println(this.x + " * " + x +" = " + this.x*x);
    }
    public static void main(String[] args) {
        X x = new X();
    }
}
