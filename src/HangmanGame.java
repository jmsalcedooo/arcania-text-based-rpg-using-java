import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame extends RPG {

    private static final String[] HARD_WORDS = {
            "java", "programming", "array",
            "overloading", "algorithm", "computer", "network", "database", "software", "hardware",
            "inheritance", "encapsulation", "polymorphism"
    };

    private static final int MAX_TRIES_BY_DIFFICULTY = 10;


    public static void StartGame() {
        Scanner scanner = new Scanner(System.in);
        int difficulty = 0;
        String wordToGuess = selectRandomWord(difficulty).toLowerCase();
        char[] guessedLetters = new char[wordToGuess.length()];
        ArrayList<Character> usedLetters = new ArrayList<>();
        int tries = 0;

        //initialize guessedLetters array with underscores
        Arrays.fill(guessedLetters, '-');

        System.out.println("Guess the word or they should die!");
        while (tries < getMaxTries(difficulty)) {
            System.out.println("\nCurrent word: " + new String(guessedLetters));
            System.out.println("Tries left: " + (getMaxTries(difficulty) - tries));

            System.out.println("Letters used: " + Arrays.toString(usedLetters.toArray()));
            System.out.print("Enter a letter: ");
            char guess;

            // Validate input to ensure it's a single letter
            while (true) {
                String input = scanner.next();
                if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                    guess = input.toLowerCase().charAt(0);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a single letter.");
                }
            }

            //check if the guess has already been used
            if (usedLetters.contains(guess)) {
                System.out.println("You've already guessed that letter. Try again!");
                continue; //skip the rest of the loop and start over
            }

            usedLetters.add(guess); //add the guess to the list of used letters

            if (containsLetter(wordToGuess, guess)) {
                System.out.println("Correct guess.");
                updateGuessedLetters(wordToGuess, guessedLetters, guess);
                if (isWordGuessed(guessedLetters)) {
                	misc.playBackgroundMusic("res/sfx/sfx_you_win.wav");
                    System.out.println("\nTsk. The word was " + wordToGuess + ". He's all yours.");
                    break;
                }
            } else {
                System.out.println("Incorrect guess. Try again!");
                tries++;
            }
        }

        //check if the maximum tries are reached
        if (tries >= getMaxTries(difficulty)) {
            System.out.println("\nUnfortunate. The word was: " + wordToGuess);
            RPG.PLAYER_LIVES = 0;
        }
    }


    private static String selectRandomWord(int difficulty) {
        String[] words;
        words = HARD_WORDS;
        return words[(int) (Math.random() * words.length)];
    }

    private static int getMaxTries(int difficulty) {
        return MAX_TRIES_BY_DIFFICULTY;
    }

    private static boolean containsLetter(String word, char letter) {
        return word.indexOf(letter) != -1;
    }

    private static void updateGuessedLetters(String word, char[] guessedLetters, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedLetters[i] = letter;
            }
        }
    }

    private static boolean isWordGuessed(char[] guessedLetters) {
        for (char letter : guessedLetters) {
            if (letter == '-') {
                return false;
            }
        }
        return true;
    }
}
