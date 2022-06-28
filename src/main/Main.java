package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (Enter '1' or '2')");

        String scannerData = new String();
        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            input = scanner.nextInt();
        } while (input != 1 && input != 2);

        float chance = new Random().nextFloat();
        do {
            System.out.println("You've approached another fork. In front of you,");
            System.out.println("you see two caves. In one cave the dragon is friendly");
            System.out.println("and will share his treasure with you. The other dragon");
            System.out.println("is greedy and hungry and will eat you on sight.");
            System.out.println("Which cave will you go into? (Enter '1' or '2')");
            System.out.print("> ");

            do {
                input = scanner.nextInt();
            } while (input != 1 && input != 2);

            chance = new Random().nextFloat();
        } while (chance < .75f);
        System.out.print("You got dead.");
    }
}
