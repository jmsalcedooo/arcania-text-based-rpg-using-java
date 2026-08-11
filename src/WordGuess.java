import java.io.IOException;
import java.util.Scanner;

public class WordGuess extends RPG {

    WordGuess() throws InterruptedException {
        super();
     
    }

    private static int playerLives;

    private static final String[] EASY_WORDS = {"java", "programming", "hangman", "valorant", "data", "array"};

    public static int playGame() throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        // playMusic()

        

        String wordToGuess = getRandomWord();
        char[] guessedLetters = new char[wordToGuess.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        int attemptsLeft = 6;
        while (attemptsLeft > 0 && !isWordGuessed(guessedLetters)) {
            System.out.println("\nWord to guess: " + new String(guessedLetters));
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Enter a letter: ");

            // Validate user input
            char guess;
            while (true) {
                String input = scanner.next().toLowerCase();
                if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                    guess = input.charAt(0);
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a single letter.");
                }
            }

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedLetters[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attemptsLeft--;
                System.out.println("[ ✖ INCORRECT GUESS ✖ ]");
            } else {
                System.out.println("[ ✓ CORRECT GUESS ✓ ]");
            }
        }

        if (isWordGuessed(guessedLetters)) {
            System.out.println("\nCongratulations! You've guessed the word: " + wordToGuess);
            System.out.println("Quest Completed! HP+1");
            increaseLives();
            increaseLives();
        } else {
            System.out.println("\nSorry, you've run out of attempts. The word was: " + wordToGuess);
            System.out.println("You lost two lives!");

            
            if (RPG.PLAYER_LIVES == 0) {
                // Display game over message
                System.out.println("💔💔💔 YOU DIED! GAME OVER! 💔💔💔");
            
            }
        }

        
        displayLives();
        return RPG.PLAYER_LIVES;
    }

    private static boolean isWordGuessed(char[] guessedLetters) {
        for (char letter : guessedLetters) {
            if (letter == '_') {
                return false;
            }
        }
        return true;
    }

    private static String getRandomWord() {
        return EASY_WORDS[(int) (Math.random() * EASY_WORDS.length)];
    }

}
