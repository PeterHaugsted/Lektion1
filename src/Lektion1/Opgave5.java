package Lektion1;

import java.util.Scanner;

public class Opgave5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast vægt");
        double vægt = scanner.nextDouble();
        System.out.println("Indtast højde");
        double højde = scanner.nextDouble();
        double BMI = vægt/Math.pow(højde,2);
        System.out.format("Dit BMI er %.1f\n", + BMI);
        if(BMI < 18.5){
            System.out.println(" Du er undervægtig");
        }
        if(BMI >= 18.5 && BMI < 25){
            System.out.println("Du er normalvægtig");
        }
        if(BMI >= 25 && BMI < 30){
            System.out.println("Du er overvægtig");
        }
        if(BMI > 30){
            System.out.println("Du er svært overvægtig");
        }
    }
}
