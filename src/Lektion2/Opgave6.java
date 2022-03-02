package Lektion2;

import java.util.Scanner;


public class Opgave6 {

    public static void main(String[] args) {
        double miles;

        Scanner in = new Scanner(System.in);

        System.out.println("Input amount of miles: ");
        miles = in.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(kilometers + "Kilometers");
    }
}