import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MathQuiz extends RPG {
    public static int num1;
    public static int num2;
    public static int answer;
    public static int tempAnswer;
    
    // IMPORTANT FOR LIVES
    private static int playerLives;

	public MathQuiz(int playerLives)  throws InterruptedException{
		
	}
    
    //Randomize the number
    public static int Range(int range) {
        Random random = new Random(System.currentTimeMillis());
        int tempRandom = random.nextInt(100);
        return tempRandom % range;
    }

    public static int playGame() throws InterruptedException, IOException {
    		
    	
    	
        switch (Range(6)) {
            case 0:
                num1 = Range(10);
                System.out.print(num1);
                	Thread.sleep(500);
                System.out.print(" + ");
                	Thread.sleep(500);

                num2 = Range(10);
                System.out.print(num2 + " = ");
                tempAnswer = num1 + num2;

                break;

            case 1:
                num1 = Range(10);
                System.out.print(num1);
                	Thread.sleep(500);
                System.out.print(" - ");
                	Thread.sleep(500);

                num2 = Range(10);
                System.out.print(num2 + " = ");
                tempAnswer = num1 - num2;

                break;

            case 2:
                num1 = Range(100);
                System.out.print(num1);
                	Thread.sleep(500);
                System.out.print(" + ");
                	Thread.sleep(500);

                num2 = Range(10);
                System.out.print(num2 + " = ");
                tempAnswer = num1 + num2;

                break;

            case 3:
                num1 = Range(100);
                System.out.print(num1);
                	Thread.sleep(500);
                System.out.print(" - ");
                	Thread.sleep(500);

                num2 = Range(10);
                System.out.print(num2 + " = ");
                tempAnswer = num1 - num2;

                break;

            case 4:
                num1 = Range(10);
                System.out.print(num1);
                	Thread.sleep(500);
                System.out.print(" + ");
                	Thread.sleep(500);

                num2 = Range(100);
                System.out.print(num2 + " = ");
                tempAnswer = num1 + num2;

                break;

            case 5:
                num1 = Range(10);
                System.out.print(num1);
                	Thread.sleep(500);
                System.out.print(" - ");
                	Thread.sleep(500);

                num2 = Range(100);
                System.out.print(num2 + " = ");
                tempAnswer = num1 - num2;

                break;
        }

        Scanner ans = new Scanner(System.in);
        answer = ans.nextInt();

        if (answer == tempAnswer) {
        	misc.playBackgroundMusic("res/sfx/sfx_you_win.wav");
            System.out.println("[ ✓ Correct ✓ ]");
            System.out.println("Quest Completed! HP+1"); 
            RPG.PLAYER_LIVES++;
        } 
        
        else {
            System.out.println("[ ✖ Wrong ✖ ]");
            System.out.println("\nThe correct answer is " + tempAnswer);

            System.out.println("You lost two lives!");
            RPG.PLAYER_LIVES--;
            RPG.PLAYER_LIVES--;
        }
        RPG.displayLives();
        playerLives = RPG.PLAYER_LIVES;

        return RPG.PLAYER_LIVES;
    }
    
    /* 	// DIFFERENT MUSIC
    private static void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("C:/eclipse-workspace/Java Project Folder/src/PackageName/Music.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
    */
}