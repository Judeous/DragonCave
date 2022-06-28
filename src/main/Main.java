package main;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (Enter '1' or '2')");

        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            input = scanner.nextInt();
        } while (input != 1 && input != 2);

        boolean quit = false;
        do {
            int score = 0;
            float chance;
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
                score++;
            } while (chance < .75f);
            System.out.println("You got dead.");
            System.out.println("You entered " + score + " forks in the cave.");

            System.out.println("Would you like to try again? ('y' or 'n')");
            String data;
            do {
                data = scanner.nextLine();
            } while (!Objects.equals(data, "y") && !Objects.equals(data, "n"));
            quit = data.equals("n");
            
        } while (!quit);
    }
}
