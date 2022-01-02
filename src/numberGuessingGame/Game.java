package numberGuessingGame;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a value between 0-100");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining right: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from your rights.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, correct guess! Your guessed number is: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("You entered an wrong number!");
                if (selected > number) {
                    System.out.println(selected + " You Guessed too high!");
                } else {
                    System.out.println(selected + " You guessed too small!");
                }

                wrong[right++] = selected;
                System.out.println("Your remaining  right : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You Lost :( ! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrong));
            }
        }

    }
}