import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.IOException;
import java.util.Random;

public class Quiz extends RPG {

    private static String[] questions = {
            "Which animal lays the largest eggs?",
            "What is the most abundant gas in Earth?",
            "What is the largest organ of the human body?",
            "Which programming language is often used for Android app development",
            "Who is the founder of Microsoft?",
            "Which element has the chemical symbol 'O'?",
            "Which famous scientist developed the theory of general relativity?",
            "How many planets are there in the Solar System?",
            "Who is known as the 'father of modern physics'?",
            "Which year was Java created?"
    };

    private static String[][] options = {
            {"Crocodile", "Ostrich", "Elephant", "Whale"},
            {"Hydrogen", "Nitrogen", "Oxygen", "Carbon Dioxide"},
            {"Skin", "Heart", "Lungs", "Liver"},
            {"Python", "C++", "Java", "Swift"},
            {"Bill Gates", "Steve Jobs", "Mark Zuckerberg", "Larry Page"},
            {"Olivine", "Osmium", "Ozone", "Oxygen"},
            {"Isaac Newton", "Albert Einstein", "Marie Curie", "Galileo Galilei"},
            {"9", "8", "7", "10"},
            {"Isaac Newton", "Niels Bohr", "Albert Einstein", "Galileo Galilei"},
            {"1996", "1989", "1972", "1492"}
    };

    private static char[] answers = {
            'D', 'B', 'A', 'C', 'A', 'D', 'B', 'B', 'C', 'B'
    };

    private static int correctAnswers;
    private static int totalQuestions = questions.length;
    private static int results;
    private static Scanner scanner = new Scanner(System.in);

    public static void startQuiz() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
     
        System.out.println("You will be presented with a series of multiple-choice questions.");
        System.out.println("Type the letter corresponding to your choice (A, B, C, or D) and press Enter.");
       

        Random random = new Random();

        // Create an array to keep track of used indexes
        boolean[] usedIndexes = new boolean[totalQuestions];

        for (int i = 0; i < 3; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(totalQuestions);
            } while (usedIndexes[randomIndex]);
            usedIndexes[randomIndex] = true;
            askQuestion(randomIndex);
        }

       
    }

    public static void askQuestion(int index) throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
    	  System.out.println("========================================");
          System.out.println("Question: " + questions[index]);
          for (int i = 0; i < 4; i++) {
              System.out.println((char) ('A' + i) + ". " + options[index][i]);
          }

          char guess;

          // Validate input to ensure it's a single letter
          while (true) {
              System.out.print("Your answer (A/B/C/D): ");
              String input = scanner.next().toUpperCase();
              if (input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'D') {
                  guess = input.charAt(0);
                  break;
              } else {
                  System.out.println("Invalid input. Please enter a single letter (A, B, C, or D).");
              }
          }

          checkAnswer(index, guess);
         
    }

    public static void checkAnswer(int index, char userAnswer) throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
        if (userAnswer == answers[index]) {
        	misc.playBackgroundMusic("res/sfx/sfx_you_win.wav");
            System.out.println("Correct!👏👏👏\n");
            RPG.PLAYER_LIVES += 3;
           RPG.PLAYER_DAMAGE++;
           
           RPG.displayLives();
        } else {
            System.out.println("Incorrect. The correct answer is " + answers[index] + "\n");
            RPG.PLAYER_LIVES--;
            RPG.displayLives();
        }
        
        if (RPG.PLAYER_LIVES <= 0) {
			System.out.println(" \n█▄█ █▀█ █░█   █▀▄ █ █▀▀ █▀▄ █   █▀▀ ▄▀█ █▀▄▀█ █▀▀   █▀█ █░█ █▀▀ █▀█ █  \r\n"
					  +         "  ░█░ █▄█ █▄█   █▄▀ █ ██▄ █▄▀ ▄   █▄█ █▀█ █░▀░█ ██▄   █▄█ ▀▄▀ ██▄ █▀▄ ▄ ");
			System.out.println("Proceeding to checkpoint.....");
			Thread.sleep(5000);
			RPG.PLAYER_LIVES = RPG.RESET_HP;
			Isekai.quest9();
		}
     
    }
    
   

    
}
