import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class misc {
    private static Clip backgroundClip;
    private static boolean isBackgroundPlaying;

    public misc() {
        isBackgroundPlaying = false;
    }

    public static void playBackgroundMusic(String filePath) {
        try {
            File file = new File(filePath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            backgroundClip = (Clip) AudioSystem.getLine(info);
            backgroundClip.open(audioInputStream);
            backgroundClip.start();
            isBackgroundPlaying = true;
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void pauseBackgroundMusic() {
        if (isBackgroundPlaying && backgroundClip != null && backgroundClip.isRunning()) {
            backgroundClip.stop();
            isBackgroundPlaying = false;
        }
    }

    public static void resumeBackgroundMusic() {
        if (!isBackgroundPlaying && backgroundClip != null) {
            backgroundClip.start();
            isBackgroundPlaying = true;
        }
    }

    public static void stopBackgroundMusic() {
        if (backgroundClip != null) {
            backgroundClip.stop();
            backgroundClip.close();
            isBackgroundPlaying = false;
        }
    }
	
	
	
	
	
	
	
	
		    private static Scanner scan = new Scanner(System.in);

		    public static int errorHandler(String prompt) {
		         int choice = 0;
		        boolean validChoice = false;		

		        while (!validChoice) {
		            try {
		                System.out.print(prompt);
		                choice = scan.nextInt();
		                validChoice = true; // Assume input is valid, will be changed if exception occurs
		            } catch (InputMismatchException e) {
		                System.out.println("Invalid input! Please enter a valid integer.");
		                scan.next(); // Consume the invalid input
		            }
		        }

		        return choice;
		    }
		
		
	
	
	
	
	
	
	

	public static void clearScreen() {
		for (int i = 0; i < 30; ++i) System.out.println();
	}

	

   
    }


	

