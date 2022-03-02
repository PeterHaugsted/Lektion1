package Mandatory_data_alg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mandatory_1 {
    public static void main(String[] args) {

        //Load data
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String[] split = line1.split(" ");

        int n = Integer.parseInt(split[0]); //Amount of pillars
        int j = Integer.parseInt(split[1]); //Max jumps

        String line2 = scanner.nextLine();
        split = line2.split(" ");

        List<Integer> pillars = new ArrayList<>();
        for (String pillar : split) {
            pillars.add(Integer.parseInt(pillar));
        }


        System.out.println(calculateMinimumStrength(n, j, pillars));
    }

    public static int calculateMinimumStrength(int n, int j, List<Integer> pillars) {
        double s = 0; //Minimum strength needed

        double sum = 0;

        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int diff = pillars.get(i + 1) - pillars.get(i);
            if (diff != 0) {
                diffs.add(diff);
            }
            sum += diff;
            if (diff > s) {
                s = diff;
            }
        }

        //Speed shit up by calculating minimum stuff
        int minStrength = (int) Math.ceil(sum / (double) j);
        if (minStrength == 0) {
            return 1;
        }


        if (s >= minStrength) {
            return (int) s;
        }


        return binarySearch(diffs, n / 2, j, n / 2);
    }

    public static int binarySearch(List<Integer> diffs, int strength, int maxJumps, int change) {
        //Our guess is the strength variable.
        //If our guess is successful try half value.
        if (isSuccessful(diffs, strength, maxJumps)) {
            int newGuess = strength - (int) Math.ceil(change / (double) 2);
            return binarySearch(diffs, newGuess, maxJumps, change / 2);
        } else {

            if (change == 1 || change == 0) {
                if (isSuccessful(diffs, strength + 1, maxJumps)) {
                    return strength + 1;
                }
                return strength;

            }
            //if our guess isn't successful, add half value to guess.
            int newGuess = strength + (int) Math.ceil(change / (double) 2);
            return binarySearch(diffs, newGuess, maxJumps, change / 2);
        }


    }

    public static boolean isSuccessful(List<Integer> diffs, int strength, int maxJumps) {
        int remainingJumpStrength = strength;
        int requiredJumps = 0;
        for (int diff : diffs) {
            remainingJumpStrength -= diff;

            if (remainingJumpStrength < 0) {
                requiredJumps++;
                remainingJumpStrength = strength - diff;

            }
        }
        return requiredJumps < maxJumps;
    }
}