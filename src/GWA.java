import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GWA extends RPG {
    static Scanner scanner = new Scanner(System.in);

    public static double compute() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
        // For first semester
        System.out.println("==============================");
        System.out.println();
        int numSubjectsFirstSem = getPositiveIntInput("How many subjects do you have on the 1st Semester?: ");
        double totalFirstSem = 0;

        System.out.println("| Subject |  Grade  |");
        System.out.println("|---------|---------|");

        for (int i = 1; i <= numSubjectsFirstSem; i++) {
            System.out.print("|    " + i + "    |   ");
            double grade = getPositiveDoubleInput();
            totalFirstSem += grade;
        }

        double averageFirstSem = totalFirstSem / numSubjectsFirstSem;

        // For second semester
        int numSubjectsSecondSem = getPositiveIntInput("How many subjects do you have on the 2nd Semester?: ");
        double totalSecondSem = 0;

        System.out.println("| Subject |  Grade  |");
        System.out.println("|---------|---------|");

        for (int i = 1; i <= numSubjectsSecondSem; i++) {
            System.out.print("|    " + i + "    |   ");
            double grade = getPositiveDoubleInput();
            totalSecondSem += grade;
        }

        double averageSecondSem = totalSecondSem / numSubjectsSecondSem;

        // Calculate GWA
        double gwa = (averageFirstSem + averageSecondSem) / 2;

        System.out.println("|==============================|");
        System.out.println("|Your GWA for the year is: " + gwa + "|");
        System.out.println("|=============================|");
        System.out.println();
        System.out.println("==============================");
        Thread.sleep(1000);

        if (gwa < 3.0) {
            Thread.sleep(2000);
            System.out.println("A flood of relief washes over you, a tangible weight lifted from your shoulders.");
            // RPG.Prompt1();
        } else {
            RPG.Prompt1();
            RPG.startGame(0);
        }

        return gwa;
    }

    // Method to get positive integer input
    private static int getPositiveIntInput(String prompt) {
        int input = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print(prompt);
                input = scanner.nextInt();
                if (input > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }
        return input;
    }

    // Method to get positive double input
    private static double getPositiveDoubleInput() {
        double input = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                input = scanner.nextDouble();
                if (input > 0) { // Changed condition to check for strictly positive numbers
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }
        return input;
    }
}
