
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class RPG {
	public	static Scanner scan = new Scanner(System.in);
		
	public	String choice;
	
	
	// 💖💖💖💖💖 
    public static  int PLAYER_LIVES = 20;
    public static int RESET_HP = 10;
    
    public static int EASY_ENEMY_LIVES = 3;	// 1 MUNA FOR TESTING
    public static int MED_ENEMY_LIVES = 4;
    public static int HARD_ENEMY_LIVES = 6;
    
    // Initialize playerLives variable
    public static int playerLives;
    
    
    // player damage
    public static int PLAYER_DAMAGE = 10;
	
    
    //Exp
    public static int PLAYER_EXP = 0;
	
	RPG()  {
		this.PLAYER_LIVES = PLAYER_LIVES;
		
	}
		
		
		void openGame() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
			misc.playBackgroundMusic("res/mus_storymode.wav");
			

		
			System.out.println("\n					░█████╗░██████╗░░█████╗░░█████╗░███╗░░██╗██╗░█████╗░    ");
			Thread.sleep(1000);
			System.out.println("					██╔══██╗██╔══██╗██╔══██╗██╔══██╗████╗░██║██║██╔══██╗     ");
			Thread.sleep(1000);
			System.out.println("					███████║██████╔╝██║░░╚═╝███████║██╔██╗██║██║███████║     ");
			Thread.sleep(1000);
			System.out.println("					██╔══██║██╔══██╗██║░░██╗██╔══██║██║╚████║██║██╔══██║     ");
			Thread.sleep(1000);
			System.out.println("					██║░░██║██║░░██║╚█████╔╝██║░░██║██║░╚███║██║██║░░██║     ");
			Thread.sleep(1000);
			System.out.println("					╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝╚═╝░░╚═╝       ");
			Thread.sleep(1000);
			

			
			
			
			
			System.out.println();
			
			System.out.println();
			System.out.println();
			 System.out.print("                                                  Press Any Key to Start the Game ");
			 scan.nextLine();
			 misc.stopBackgroundMusic();
			 Thread.sleep(1000);
			 misc.clearScreen();
			 startGame(0);
			 
			
			
			 
		}
		public static void startGame (double gwa) throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException{
		
		
		misc.playBackgroundMusic("res/sfx/mus_school_ambience.wav");
		
		System.out.println();
		System.out.println("===========================================================");
		System.out.println("===========================================================");
		System.out.println();
		System.out.println("You find yourself sitting in a cramped classroom,");
		Thread.sleep(5000);
		System.out.println("the fluorescent lights buzzing\noverhead as your professor drones on about the importance of academic performance.");
		Thread.sleep(5000);
		System.out.println("\nThe semester has been a blur of lectures, assignments,\nand sleepless nights, but now it all comes down to this:");
	
		// GWA
		Thread.sleep(5000);
		System.out.println();
		System.out.println("Inputting your grades into the university's\nGWA calculator to determine your final grade: ");
		Thread.sleep(5000);
		
		// GWA CLASS
		GWA.compute();
			
		
		
		} 
		
		static void Prompt1()throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
			misc.clearScreen();
			System.out.println();
			System.out.println("====================");
			System.out.println("Before the ramifications of your failure can fully sink in, a strange sensation envelops you.");
			Thread.sleep(5000);
			System.out.println("The classroom dissolves into darkness, and an abyssal void yawns open beneath you");
			Thread.sleep(5000);
			System.out.println("sending you tumbling into unconsciousness.\r\n"
					+ "");
			System.out.println();
			Thread.sleep(5000);
			System.out.println("Suddenly, a window popped up…");
			Thread.sleep(5000);
			misc.stopBackgroundMusic();
			
			Isekai.popUp();
		}
		
		// 👁️ SHOWS THE LIVES
	   protected static String getLives(int lives) {
	        StringBuilder livesString = new StringBuilder();
	        for (int i = 0; i < lives; i++) {
	            livesString.append("❤️ " );
	        }
	        return livesString.toString(); // Convert into string
	    }
		
	    // 👁️ DISPLAY THE CURRENT STATUS OF LIVES
	  protected static void displayLives() throws InterruptedException {
	        System.out.println("LIVES: " + getLives(PLAYER_LIVES));
	        	//Thread.sleep(1000);
	    }
	    
	    public static void increaseLives() {
	    	PLAYER_LIVES+=1;
	    }
	    
	   public static void decreaseLives() {
		   PLAYER_LIVES-=1;
	    }
		
}

		


