import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class RPS extends RPG {

	public static int easyLives = RPG.EASY_ENEMY_LIVES;

	public RPS() throws InterruptedException {
		easyLives = RPG.EASY_ENEMY_LIVES;
	}

	public static void playGame(int lives)
			throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		Scanner scanner = new Scanner(System.in);
		easyLives = RPG.EASY_ENEMY_LIVES;

		

		while (RPG.PLAYER_LIVES > 0 && easyLives > 0) {
			System.out.println();
			System.out.println(" ╔═════════════════════════════════════╗");
			System.out.println("║            r = (✊)rock               ║");
			System.out.println("║            p = (🖐️)paper              ║");
			System.out.println("║            s = (✌️)scissors           ║");
			System.out.println(" ╚═════════════════════════════════════╝");

			System.out.print("          Enter your choice: ");
			String playerChoice = scan.nextLine();

			System.out.print("            ");
            System.out.print("✊     ");
            Thread.sleep(900);
            System.out.print("🖐️     ");
            Thread.sleep(900);
            System.out.print("✌️     ");
            Thread.sleep(900);
            System.out.println("     ");

			switch (playerChoice) {
			case "r":
				playerChoice = "✊";
				break;
			case "p":
				playerChoice = "🖐️";
				break;
			case "s":
				playerChoice = "✌️";
				break;
			}

			if (playerChoice.equals("✊") || playerChoice.equals("🖐️") || playerChoice.equals("✌️")) {
				String computerChoice = generateComputerChoice();

				Thread.sleep(900);
            	System.out.println("\n     You: ["+ playerChoice + "]   ⚔️vs⚔️   [" + computerChoice + "] :Enemy");
				Thread.sleep(1200);
				String result = determineWinner(playerChoice, computerChoice);

				Thread.sleep(1800);
				updateLives(result);
				displayLives();
				Thread.sleep(1000);
			} else {
				System.out.println("\n         ⚠️ Invalid choice! ⚠️       ");
            	Thread.sleep(1000);
                System.out.println("         \"What are you doing?\"       \n");
			}
		}

		if (RPG.PLAYER_LIVES == 0) {
			misc.playBackgroundMusic("res/sfx/sfx_game_over.wav");
			System.out.println("       💔 YOU DIED! GAME OVER! 💔     ");
			Thread.sleep(2000);
			misc.stopBackgroundMusic();
			Isekai.quest6();
		}

		else {
			misc.playBackgroundMusic("res/sfx/sfx_you_win.wav");
			System.out.println("             🎉 You Win! 🎉             ");
            Thread.sleep(2000);
            misc.stopBackgroundMusic();
            
		}

		System.out.println(" ╔═════════════════════════════════════╗");
		System.out.println("║           ⚔️ BATTLE END ⚔️            ║");
		System.out.println(" ╚═════════════════════════════════════╝");
	}

	private static String generateComputerChoice() {
		String[] choices = { "✊", "🖐️", "✌️" };
		return choices[new Random().nextInt(choices.length)];
	}

	private static String determineWinner(String playerChoice, String computerChoice) throws InterruptedException {
		if (playerChoice.equals(computerChoice)) {
			Thread.sleep(1000);
			
			return "draw";
		} else if ((playerChoice.equals("✊") && computerChoice.equals("✌️"))
				|| (playerChoice.equals("✌️") && computerChoice.equals("🖐️"))
				|| (playerChoice.equals("🖐️") && computerChoice.equals("✊"))) {
			return "player";
		} else {
			return "computer";
		}
	}

	
	
	
	
	
	
	private static void updateLives(String result) throws InterruptedException {
		misc.clearScreen();
		switch (result) {
		case "player":
			misc.playBackgroundMusic("res/sfx/sfx_player_or_enemy_hit.wav");
			System.out.println("╔═══════════════════════════════════════╗");
			System.out.println("║            *Enemy got hit!*           ║");
			System.out.println("╚═══════════════════════════════════════╝");
			easyLives--;
			misc.stopBackgroundMusic();
			break;
		case "computer":
			Thread.sleep(1000);
			misc.playBackgroundMusic("res/sfx/sfx_player_or_enemy_hit.wav");
			System.out.println("╔═══════════════════════════════════════╗");
			System.out.println("║           *Player got hit!*           ║");
			System.out.println("╚═══════════════════════════════════════╝");
			misc.stopBackgroundMusic();
			RPG.decreaseLives(); // 📌IMPORTANT
			break;
		case "draw":
			misc.playBackgroundMusic("res/sfx/sfx_rps_draw.wav");
			System.out.println("╔═══════════════════════════════════════╗");
			System.out.println("║         *Draw! None was hit!*         ║");
			System.out.println("╚═══════════════════════════════════════╝");
			misc.stopBackgroundMusic();
			break;
		}
		
		misc.stopBackgroundMusic();
	}

	protected static void displayLives() throws InterruptedException {
        System.out.println("  Player: " + getLives(RPG.PLAYER_LIVES));
        Thread.sleep(1000);
        System.out.println("  Enemy: " + getLives(easyLives));
        Thread.sleep(1000);
        
        
        
	}
	
	

}