package Lesson15_01_2024;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        int guessed = 0;

        while (guessed != number) {
            System.out.println("Guess and input the number: ");
            guessed = scanner.nextInt();

            if (guessed < number)
                System.out.println("Greater");

            else if (guessed > number)
                System.out.println("Less");

            else
                System.out.println("You are correct!");
        }
    }
}
