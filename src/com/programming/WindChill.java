package com.programming;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the air temperature (t) in Fahrenheit :");
        double t = sc.nextDouble();
        System.out.println("Enter the speed of air (v) in mph :");
        double v = sc.nextDouble();

        calc(t,v);
    }

    public static void calc(double t, double v) {

        if (t <= 50 && v <= 120 && v >= 3)
        {
            double w = (35.74) + ((0.6215) * t) + ((0.4275) * (t) - 35.75) * (Math.pow(v, 0.16));
            System.out.println("Wind chill " + w);
        }
    }
}
