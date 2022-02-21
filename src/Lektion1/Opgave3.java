package Lektion1;

import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String password = scanner.nextLine();
            //System.out.println(password.length());
            if (password.length() > 8) {
                System.out.println("Password for langt");
            } else if (password.length() < 5) {
                System.out.println("Password for kort");
            } else {
                System.out.println("Password tilpas");
                break;
            }
        }
    }
}
