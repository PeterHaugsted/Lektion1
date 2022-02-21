package Lektion1;

import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double a = (y2-y1)/(x2-x1);
        double b = (y1-a*x1);
        System.out.println("y = "+ a + "x + " + b);
    }
}
