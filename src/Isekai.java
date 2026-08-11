import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Isekai extends RPG {
	
	
	static Random evade = new Random();
	
	static // static Scanner scan = new Scanner(System.in);

	int choice;

	final static String ANSI_BOLD = "\u001B[1m";
	// ANSI escape code to reset formatting
	final static String ANSI_RESET = "\u001B[0m";
	static int sleep = 3000;

	RPG mathQ = new MathQuiz(RPG.PLAYER_LIVES);
	RPG rps = new RPS();
	RPG quiz = new Quiz();
	RPG wordG = new WordGuess();
	RPG gwa = new GWA();
	
	RPG man = new HangmanGame();
	
	
	

	Isekai() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		
	}


	public static void popUp()throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		misc.playBackgroundMusic("res/mus_storymode.wav");
		

		
	
		System.out.println("\n    █░█░█ █▀▀ █░░ █▀▀ █▀█ █▀▄▀█ █▀▀   ▀█▀ █▀█   ▀█▀ █░█ █▀▀   █░█░█ █▀█ █▀█ █░░ █▀▄   █▀█ █▀▀   ▄▀█ █▀█ █▀▀ ▄▀█ █▄░█ █ ▄▀█ ");
		Thread.sleep(2000);
		System.out.println("    "
				               + "▀▄▀▄▀ ██▄ █▄▄ █▄▄ █▄█ █░▀░█ ██▄   ░█░ █▄█   ░█░ █▀█ ██▄   ▀▄▀▄▀ █▄█ █▀▄ █▄▄ █▄▀   █▄█ █▀░   █▀█ █▀▄ █▄▄ █▀█ █░▀█ █ █▀█ ");
		
		Thread.sleep(5000);
		
		System.out.println("\n\nComplete these quests to unlock rewards and uncover\nthe secrets of this realm. \r\n" + "");
		System.out.println();

	
		misc.stopBackgroundMusic();
		// Quest 1 Prompt
		System.out.println();
		System.out.println("Press [1]");
		System.out.println("\r\n"
				+ " ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				+ "║   █▀▀ ▀▄▀ █▀█ █░░ █▀█ █▀█ █▀▀   ▀█▀ █░█ █▀▀   █▀▄▀█ █▄█ █▀ ▀█▀ █▀▀ █▀█ █ █▀█ █░█ █▀   ▀█▀ █▀█ █░█░█ █▄░█   ║\r\n"
				+ "║   ██▄ █░█ █▀▀ █▄▄ █▄█ █▀▄ ██▄   ░█░ █▀█ ██▄   █░▀░█ ░█░ ▄█ ░█░ ██▄ █▀▄ █ █▄█ █▄█ ▄█   ░█░ █▄█ ▀▄▀▄▀ █░▀█   ║\r\n"
				+ " ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				+ "\r\n"
				+ "");
		Thread.sleep(sleep);
		System.out.println("Objective: Investigate the strange occurrences in the town of Eldoria.");
		Thread.sleep(sleep);
		System.out
				.println("Reward: Unlocks access to valuable information about the town's history and inhabitants.\r");
		Thread.sleep(sleep);
		// Quest 2 Prompt
		System.out.println();
		System.out.println("Press [2]");
		System.out.println("\r\n"
				+ " ╔════════════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				+ "║   █▄▄ █▀█ ▄▀█ █░█ █▀▀   ▀█▀ █░█ █▀▀   █▀▀ █▀█ █▀█ █▀▀ █▄▄ █▀█ █▀▄ █ █▄░█ █▀▀   █▀▀ ▄▀█ █░█ █▀▀   ║\r\n"
				+ "║   █▄█ █▀▄ █▀█ ▀▄▀ ██▄   ░█░ █▀█ ██▄   █▀░ █▄█ █▀▄ ██▄ █▄█ █▄█ █▄▀ █ █░▀█ █▄█   █▄▄ █▀█ ▀▄▀ ██▄   ║\r\n"
				+ " ╚════════════════════════════════════════════════════════════════════════════════════════════════╝"
				+ "");
		Thread.sleep(sleep);
		System.out.println("\n\nObjective: Delve into the depths of the ominous cave and uncover its secrets");
		Thread.sleep(sleep);
		System.out.println("Reward: Acquire rare artifacts and powerful items hidden within the cave's depths.");

		int quest=0;

		do {
			try {
				System.out.print("Pick your desired Quest:");
				quest = scan.nextInt();

				switch (quest) {
				case 1:
					misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
					Thread.sleep(sleep);
					misc.clearScreen();
					misc.stopBackgroundMusic();
					Thread.sleep(sleep);


					misc.stopBackgroundMusic();
					quest1();

					break;

				case 2:
					misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
					Thread.sleep(sleep);
					misc.clearScreen();
					misc.stopBackgroundMusic();
					Thread.sleep(sleep);

					misc.stopBackgroundMusic();
					quest4();

					break;

				default:
					System.out.println("You have Entered a Wrong Number, PLS TRY AGAIN");
					break;
				}
			}
			catch (InputMismatchException e){
				System.out.println("\"I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
				scan.next();
			}
		} while (quest != 1 && quest != 2);
	}
		
	// end ng method

	static void quest1() 
			throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		misc.playBackgroundMusic("res/mus_storymode.wav");
		Thread.sleep(sleep);
		String choice;
		
		Thread.sleep(sleep);
		System.out.println();
		Ascii.eldoria();
		Thread.sleep(sleep);
		misc.clearScreen();
		System.out.println("=========================================");
		System.out.println("As you enter Eldoria, you notice an eerie mist hanging over the streets.");
		Thread.sleep(sleep);
		System.out.println("Strange whispers seem to follow you wherever you go");
		Thread.sleep(sleep);
		System.out.println("Investigate the town square to uncover the source of these unsettling occurrences.");
		Thread.sleep(sleep);
		System.out.println();
		// Decision
		System.out.println("[1] Go to nearby Guard and talk to him");
		System.out.println("[2] Go forward to the castle");
		System.out.print("What will you do?: ");
		choice = scan.next();

		boolean validChoice = false;

		while (!validChoice) {
			switch (choice) {
			
			case "1":
				String decide;
				Thread.sleep(sleep);
				System.out.print(
						"Guard: You seem capable. Perhaps you can aid me.\nWill you lend your strength?");
				System.out.println("\n[Yes] or [No]");
				decide = scan.next();
				if (decide.equalsIgnoreCase("yes")) {
					Thread.sleep(sleep);
					System.out.println();
					System.out.println(
							"Guard: A true hero. Listen, we've got trouble. People are vanishing left and right, and nobody knows why.\nWe need someone to get to the bottom of this. There are rumors of an enigmatic elder residing on the outskirts of Eldoria that knows what is happening.\nPerhaps he can help you. And while you're at it, keep an eye out for my fellow guards. Some of them went missing. Bring 'em back if you can.\n");
					Thread.sleep(9000);
					misc.clearScreen();
					misc.stopBackgroundMusic();
					quest3();
					validChoice = true; // Set to true to exit the loop
				} else if (decide.equalsIgnoreCase("no")) {
					System.out.println("So I guess you're not interested in the quest. MOVE OUT!");
					misc.clearScreen();
					quest4();
					validChoice = true; // Set to true to exit the loop
				} else {
					System.out.println();

					System.out.println("OOOPS INVALID CHOICE!! PLEASE TRY AGAIN AND ANSWER YES OR NO ONLY!");
					System.out.println();
				}
				break;

			case "2":
				misc.stopBackgroundMusic();
				System.out.println("As you reach the castle, all you find are crumbling ruins, echoing with the whispers of the past.");
			    Thread.sleep(sleep);
			    System.out.println("It seems there's nothing of value or interest here.");
			    Thread.sleep(sleep);
			    System.out.println("You decide to retrace your steps back to the town square.");
			    Thread.sleep(sleep);
			    System.out.println();
				misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
				Thread.sleep(2000);
				misc.stopBackgroundMusic();
				quest1();
				validChoice = true; // Set to true to exit the loop
				break;

			default:
				System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
				System.out.print("What will you do?: "); // Prompt again
				choice = scan.next(); // Read user input again
				break;

			}
		}
		misc.stopBackgroundMusic();
	}

	static void quest2() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException{
		int decideQ;
		System.out.println("========================================");
		System.out.println("You continued walking and soon arrived at the rumored elder’s location.");
		Thread.sleep(sleep);
		System.out.println("Elder: Ah, you've finally arrived. I have been expecting you, adventurer.");
		Thread.sleep(sleep);
		System.out.println("There is a task of great importance that requires your assistance.");
		Thread.sleep(sleep);

		// Prompt
		System.out.println("But then again, I shall have to test you.");
		System.out.println();
		System.out.println("[1] Agree to test\n[2] Ignore");
		boolean validChoice = false;
		
		while(!validChoice) {
			try{
				decideQ = scan.nextInt();
				if (decideQ == 1) {
					misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
					misc.stopBackgroundMusic();
					Thread.sleep(2000);
					misc.stopBackgroundMusic();
					quest5();
					validChoice = true;
				} else if (decideQ == 2) {
					System.out.println(
							"Very well, follow me, and I will explain everything.\nBut be warned, the path ahead is fraught with danger.");
					misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
					misc.stopBackgroundMusic();
					System.out.println(
							"You continue your journey. In a seemingly endless forest you encounter a mischievous fairy known for their cunning and wit.");
					Thread.sleep(2000);
					misc.stopBackgroundMusic();
					quest6();
					validChoice = true;
				}
				else {
					System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
					System.out.println("[1] Agree to test\n[2] Ignore");
					
				}
			}catch (InputMismatchException e){
				System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
				scan.next();
			}
		}
	}

	static void quest3() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		int decide;
		misc.playBackgroundMusic("res/mus_storymode.wav");
		Thread.sleep(sleep);
		
		System.out.println(" ╔═══════════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				+ "║   ▄▀█ █▀ █▀ █ █▀ ▀█▀   ▀█▀ █░█ █▀▀   █▀▀ █▄░█ █ █▀▀ █▀▄▀█ ▄▀█ ▀█▀ █ █▀▀   █▀▀ █░░ █▀▄ █▀▀ █▀█   ║\r\n"
				+ "║   █▀█ ▄█ ▄█ █ ▄█ ░█░   ░█░ █▀█ ██▄   ██▄ █░▀█ █ █▄█ █░▀░█ █▀█ ░█░ █ █▄▄   ██▄ █▄▄ █▄▀ ██▄ █▀▄   ║\r\n"
				+ " ╚═══════════════════════════════════════════════════════════════════════════════════════════════╝");
		System.out.println();
		

		String obj = "Objective";
		String rewards = "Rewards";
		String sideQ = "Side Quest";
		Thread.sleep(sleep);
		System.out.println(ANSI_BOLD + obj + ANSI_RESET
				+ ": Seek out the enigmatic elder and aid them in a task of great importance.");
		Thread.sleep(sleep);
		System.out.println(ANSI_BOLD + rewards + ANSI_RESET
				+ "	 : Gain the elder's wisdom and receive a unique skill or ability as a token of gratitude.");
		Thread.sleep(sleep);
		System.out.println(ANSI_BOLD + sideQ + ANSI_RESET + ": rescue guards");
		System.out.println("========================================");

		// Prompt
		System.out.println("On your way to the rumored elder, you find the foreboding cave you’ve seen before.");
		System.out.println("[1] Go in the cave");
		System.out.println("[2] Continue Walking");
		boolean validChoice = false;
		
		while(!validChoice) {
			try {
				decide = scan.nextInt();
				switch (decide) {
				case 1:
					misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
					Thread.sleep(2000);
					misc.clearScreen();
					misc.stopBackgroundMusic();
					quest3_1();
					validChoice = true;// page 4
					break;
				case 2:
					misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
					Thread.sleep(2000);
					misc.stopBackgroundMusic();
					quest2();
					validChoice = true;
					break;
					
				default:System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
					System.out.print("[1] Go in the cave.");
					System.out.print("[2] Continue Walking");
					
					
				}
			}catch (InputMismatchException e){
				System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
				scan.next();
			}
		}
	}

	// page 4 quest
	// QUEST 2 PROMPT
	static void quest3_1() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {

		
		Thread.sleep(sleep);
		System.out.println("Torch in hand, you descend into the darkness, uncertain of what awaits you in the shadows.");
		Thread.sleep(sleep);
		System.out.println("Further along the path, you confront a skeleton, the clash of steel inevitable.");
		Thread.sleep(sleep);
		Ascii.skeleton();
		Thread.sleep(sleep);
		// page 4
		// fight scene rah
		int decide;
		int skeletonAttack = 1;
		int skeletonHP = 15;
		boolean validChoice = false;

		while (RPG.PLAYER_LIVES > 0 && skeletonHP > 0) {
			validChoice = false;
			System.out.println();
			misc.clearScreen();
			System.out.println("The skeleton is approaching!");
			System.out.println();
			Thread.sleep(sleep);
			RPG.displayLives();
			System.out.println();
			Ascii.combatPrompt();
			
			while(!validChoice) {
				try {
					decide = scan.nextInt();
					switch (decide) {
					case 1:
						if (evade.nextInt(100) < 20) {
							System.out.println();
							Thread.sleep(1000);
							
							
				   System.out.println("─█▀▀█ ▀▀█▀▀ ▀▀█▀▀ ─█▀▀█ ░█▀▀█ ░█─▄▀ 　 ░█▀▄▀█ ▀█▀ ░█▀▀▀█ ░█▀▀▀█ ░█▀▀▀ ░█▀▀▄ \r\n"
									+ "░█▄▄█ ─░█── ─░█── ░█▄▄█ ░█─── ░█▀▄─ 　 ░█░█░█ ░█─ ─▀▀▀▄▄ ─▀▀▀▄▄ ░█▀▀▀ ░█─░█ \r\n"
									+ "░█─░█ ─░█── ─░█── ░█─░█ ░█▄▄█ ░█─░█ 　 ░█──░█ ▄█▄ ░█▄▄▄█ ░█▄▄▄█ ░█▄▄▄ ░█▄▄▀\r\n"
									+ "");
							
							misc.playBackgroundMusic("res/sfx/sfx_player_or_enemy_hit.wav");
							Thread.sleep(1000);
							misc.stopBackgroundMusic();
							System.out.println("The skeleton took the chance and strikes you!");
							Thread.sleep(sleep);
							Ascii.skeletonStrike();
							Thread.sleep(1000);
							System.out.println("Your HP decreased.");
							Thread.sleep(sleep);
							misc.clearScreen();
							RPG.PLAYER_LIVES -= skeletonAttack;
							validChoice = true;

						} else {
							Thread.sleep(1000);
							misc.playBackgroundMusic("res/sfx/sfx_player_or_enemy_hit.wav");
							Thread.sleep(1000);
				   System.out.println("▀▀█▀▀ █──█ █▀▀ 　 █▀▀ █─█ █▀▀ █── █▀▀ ▀▀█▀▀ █▀▀█ █▀▀▄ 　 █──█ █▀▀█ █▀▀ 　 █▀▀▄ █▀▀ █▀▀ █▀▀▄   ░█─░█ ▀█▀ ▀▀█▀▀ █ \r\n"
									+ "─░█── █▀▀█ █▀▀ 　 ▀▀█ █▀▄ █▀▀ █── █▀▀ ──█── █──█ █──█ 　 █▀▀█ █▄▄█ ▀▀█ 　 █▀▀▄ █▀▀ █▀▀ █──█   ░█▀▀█ ░█─ ─░█── ▀ \r\n"
									+ "─░█── ▀──▀ ▀▀▀ 　 ▀▀▀ ▀─▀ ▀▀▀ ▀▀▀ ▀▀▀ ──▀── ▀▀▀▀ ▀──▀ 　 ▀──▀ ▀──▀ ▀▀▀ 　 ▀▀▀─ ▀▀▀ ▀▀▀ ▀──▀   ░█─░█ ▄█▄ ─░█── ▄\r\n"
									+ "");
							
							System.out.println("The skeleton's HP decreased.");
							Ascii.skeletonDamaged();
							Thread.sleep(sleep);
							misc.clearScreen();
							skeletonHP -= RPG.PLAYER_DAMAGE;
							validChoice = true;

						}

						break;

					default:
						System.out.println("Invalid choice!");
						

					}
				}catch(InputMismatchException e){
					System.out.println("Invalid input. Please enter a number.");
					scan.next();
				}
			}
			// Skeleton hitting u
			if (skeletonHP > 0) {
				System.out.println();
				misc.clearScreen();
				System.out.println("The skeleton strikes!");
				misc.playBackgroundMusic("res/sfx/sfx_player_or_enemy_hit.wav");
				Ascii.skeletonStrike();
				Thread.sleep(1000);
				System.out.println("Your HP decreased.");
				misc.stopBackgroundMusic();
				RPG.PLAYER_LIVES -= skeletonAttack;
				System.out.println();
			}
			

			// check lives
			System.out.println();
			

			RPG.displayLives();
		}

		misc.stopBackgroundMusic();
		System.out.println("The skeleton's life depleted.");
		misc.playBackgroundMusic("res/sfx/sfx_you_win.wav");
		Thread.sleep(5000);

		// LABANNNNN
		System.out.println();
		System.out.println("============================================");
		Thread.sleep(sleep);
		System.out.println("Emerging victorious, you press onward, only to stumble upon a grisly sight:");
		System.out.println();
		Thread.sleep(1000);
		misc.playBackgroundMusic("res/sfx/sfx_exp.wav");
		Thread.sleep(1000);
		misc.stopBackgroundMusic();
		RPG.PLAYER_EXP++;
		RPG.PLAYER_LIVES++;
		System.out.println("\n█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▀▀ ▄▀█ █ █▄░█ █▀▀ █▀▄   █▀▀ ▀▄▀ █▀█ █\r\n"
				           + "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █▄█ █▀█ █ █░▀█ ██▄ █▄▀   ██▄ █░█ █▀▀ ▄");
		System.out.println("\nCurrent EXP: " + RPG.PLAYER_EXP);

		// VICTORY ~
		System.out.println();

		RPG.displayLives();
		misc.clearScreen();
		misc.stopBackgroundMusic();
		quest4();

		Thread.sleep(2000);

	}

	
	// Quest 4
	static void quest4() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		misc.stopBackgroundMusic();

		misc.playBackgroundMusic("res/mus_storymode.wav");
		System.out.println("Torch in hand, you descend into the darkness, uncertain of what awaits you in the shadows.");

		Thread.sleep(sleep);
		System.out.println("A man dangling by a thread, captured by the skeletons' cruel grasp.");
		System.out.println("Their leader, witnessing your prowess, proposes a challenge of wits rather than brawn.");
		Thread.sleep(sleep);
		int decide;
		
		System.out.println("\r\n"
				+ "  ╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				+ " ║   █▀▀ █░█ ▄▀█ █░░ █░░ █▀▀ █▄░█ █▀▀ █▀▀   ▀█▀ █░█ █▀▀   █▀ █▄▀ █▀▀ █░░ █▀▀ ▀█▀ █▀█ █▄░█   █░░ █▀▀ ▄▀█ █▀▄ █▀▀ █▀█     ║\r\n"
				+ "║    █▄▄ █▀█ █▀█ █▄▄ █▄▄ ██▄ █░▀█ █▄█ ██▄   ░█░ █▀█ ██▄   ▄█ █░█ ██▄ █▄▄ ██▄ ░█░ █▄█ █░▀█   █▄▄ ██▄ █▀█ █▄▀ ██▄ █▀▄      ║\r\n"
				+ "║                                                                                                                        ║\r\n"
				+ "║                           █ █▄░█     ▄▀█   █▄▄ ▄▀█ ▀█▀ ▀█▀ █░░ █▀▀   █▀█ █▀▀   █░█░█ █ ▀█▀ █▀                          ║\r\n"
				+ " ║                          █ █░▀█     █▀█   █▄█ █▀█ ░█░ ░█░ █▄▄ ██▄   █▄█ █▀░   ▀▄▀▄▀ █ ░█░ ▄█                         ║\r\n"
				+ "  ╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
		System.out.println();
		

		Thread.sleep(sleep);
		System.out.println(
				"Objective: Engage the Skeleton Leader in a strategic showdown testing your vocabulary and deduction skills.");
		Thread.sleep(sleep);
		System.out.println(
				"Reward   : Claim the Skeleton Leader's prized artifact, and perhaps another thing of importance.");
		System.out.println("========================================");
		Ascii.skeletonLeader();
		Thread.sleep(sleep);
		System.out.println("Leader: “I shall let them go if you guess the words I have for you.  You have ten attempts.\nSolve them all, and he is yours. Refuse, and face the consequences.\"[1] Accept [2] Decline: ");
		boolean validChoice = false;
		while(!validChoice) {
			try {
				decide = scan.nextInt();
				if (decide == 1) {
					System.out.println("Accepting the challenge, you steel your mind for the trial ahead");
					Thread.sleep(sleep);
					System.out.println("ready to put your intellect against the shadows that encroach upon this mysterious realm.");
					misc.stopBackgroundMusic();
					HangmanGame.StartGame();
					validChoice = true;
				} else if (decide == 2) {
					Thread.sleep(sleep);
					System.out.println("In defiance, you meet your fate as the leader's strike finds its mark, extinguishing your life..");
					misc.stopBackgroundMusic();
					Thread.sleep(sleep);
					System.out.println("Proceeding to checkpoint.....");
					Thread.sleep(5000);
					quest4();
					validChoice = true;
				}else {
					System.out.println("Enter 1 or 2 only");
					
				}
			}catch(InputMismatchException e){
				System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
				scan.next();
			}
		}


		// loss
		if (RPG.PLAYER_LIVES == 0) {
			 System.out.println("\n█▄█ █▀█ █░█   █▀▄ █ █▀▀ █▀▄ █   █▀▀ ▄▀█ █▀▄▀█ █▀▀   █▀█ █░█ █▀▀ █▀█ █  \r\n"
					          + "  ░█░ █▄█ █▄█   █▄▀ █ ██▄ █▄▀ ▄   █▄█ █▀█ █░▀░█ ██▄   █▄█ ▀▄▀ ██▄ █▀▄ ▄ \r\n"
					+ "	");
			System.out.println("Proceeding to checkpoint.....");
			Thread.sleep(5000);
			quest4();
		}

		// victory ++ exp yehey
		misc.playBackgroundMusic("res/sfx/sfx_exp.wav");
		Thread.sleep(1000);
		misc.stopBackgroundMusic();
		RPG.PLAYER_EXP++;
		RPG.PLAYER_LIVES++;
		RPG.displayLives();
		Thread.sleep(sleep);
		RPG.PLAYER_DAMAGE += 10;
		
		
		System.out.println("Gain new sword: Wrath⚔️");
		Ascii.sword();

		System.out.println();

		System.out.println("You start walking away from the skeleton.");
		Thread.sleep(sleep);
		quest2();

		misc.stopBackgroundMusic();
	}





	public static void quest5() throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		System.out.println("  ╔═════════════════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				+ " ║   █▀█ █▀█ █▀█ █░█ █▀▀   █▄█ █▀█ █░█ █▀█   █▀▄▀█ ▄▀█ █▀ ▀█▀ █▀▀ █▀█ █▄█   █ █▄░█   █▀▄▀█ ▄▀█ ▀█▀ █░█   ║\r\n"
				+ "║    █▀▀ █▀▄ █▄█ ▀▄▀ ██▄   ░█░ █▄█ █▄█ █▀▄   █░▀░█ █▀█ ▄█ ░█░ ██▄ █▀▄ ░█░   █ █░▀█   █░▀░█ █▀█ ░█░ █▀█    ║\r\n"
				+ "║                                                                                                         ║\r\n"
				+ "║             ▄▀█ █▀▀ ▄▀█ █ █▄░█ █▀ ▀█▀   ▀█▀ █░█ █▀▀   █▀█ █░░ █▀▄   █░█ █▀▀ █▀█ █▀▄▀█ █ ▀█▀             ║  \r\n"
				+ " ║            █▀█ █▄█ █▀█ █ █░▀█ ▄█ ░█░   ░█░ █▀█ ██▄   █▄█ █▄▄ █▄▀   █▀█ ██▄ █▀▄ █░▀░█ █ ░█░            ║  \r\n"
				+ "  ╚═════════════════════════════════════════════════════════════════════════════════════════════════════╝");
		System.out.println();
		System.out.println("Objective: Face the Old Hermit in a series of challenging mathematical quizzes to demonstrate your intellect.");
		Thread.sleep(sleep);
		System.out.println("=====================================");

		System.out.println();

		System.out.println("The Old Hermit's gaze pierces through the mist, his eyes alight with\nancient wisdom as he presents you with the first of his mathematical challenges.");
		System.out.println("Proceeding to ACTION!!!!!!");
		Thread.sleep(2000);

		// game
		int failureThreshold = RPG.PLAYER_LIVES - 3;
		MathQuiz.playGame();
		System.out.println();
		Thread.sleep(sleep);
		MathQuiz.playGame();
		System.out.println();
		Thread.sleep(sleep);
		MathQuiz.playGame();
		Thread.sleep(sleep);
		if (RPG.PLAYER_LIVES <= failureThreshold) {
			System.out.println("Elder: \"You were not able to satisfy my needs.”");
			System.out.println();
			Thread.sleep(sleep);
			System.out.println("Elder: \"Continue down this road,  deep within the enchanted forest surrounding Eldoria. The answer you seek will be found if you continue down this path”");
			System.out.println();
			Thread.sleep(sleep);
			misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
			System.out.println("You continue your journey. In a seemingly endless forest you encounter a mischievous fairy known for their cunning and wit.");
			System.out.println("==========================================================");
			Thread.sleep(sleep);
			misc.stopBackgroundMusic();
			quest6();
		}else{
			System.out.println();
			System.out.println("==========================================================");
			System.out.println("Elder: Impressive. You have proven yourself worthy to delve into the depths of my knowledge.\nEnter, and may the secrets of the ancients illuminate your path.");
			RPG.PLAYER_EXP++;
			System.out.println("\r\n"
					+ "█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▀▀ ▄▀█ █ █▄░█ █▀▀ █▀▄   █▀▀ ▀▄▀ █▀█ █\r\n"
					+ "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █▄█ █▀█ █ █░▀█ ██▄ █▄▀   ██▄ █░█ █▀▀ ");
			System.out.println("\nEXP: " + RPG.PLAYER_EXP);
			misc.playBackgroundMusic("res/sfx/sfx_exp.wav");
			Thread.sleep(1000);
			misc.stopBackgroundMusic();
			Thread.sleep(sleep);

			System.out.println();
			Thread.sleep(sleep);
			System.out.println("As you step into the hermit's library, a sense of wonder washes over you, the shelves lined with tomes bound in leather older than time itself.");
			System.out.println();
			Thread.sleep(sleep);
			System.out.println("The air is thick with the scent of ancient parchment, and the flickering light of enchanted candles casts eerie shadows upon the walls.");
			System.out.println();
			Thread.sleep(sleep);
			System.out.println("You spend hours poring over the texts, absorbing knowledge that transcends mortal comprehension.");
			System.out.println();
			Thread.sleep(sleep);
			System.out.println("Each page unveils new wonders, and with each revelation, you feel yourself growing stronger, your mind expanding to encompass the vastness of the cosmos.");
			System.out.println();

			Thread.sleep(sleep);
			System.out.println("Finally, as the last rays of sunlight fade from the sky, you emerge from the library, your heart brimming with newfound wisdom and power.");
			System.out.println("==========================================================");

			Thread.sleep(sleep);
			System.out.println("Elder: \"You have done well, adventurer. Go forth now, and may the knowledge you have gained serve you well on your journey.\"");

			System.out.println();
			Thread.sleep(sleep);
			System.out.println("Elder: \"Continue down this road,  deep within the enchanted forest surrounding Eldoria. The answer you seek will be found if you continue down this path”");
			System.out.println();
			Thread.sleep(sleep);
			misc.playBackgroundMusic("res/sfx/sfx_walk.wav");
			System.out.println("You continue your journey. In a seemingly endless forest you encounter a mischievous fairy known for their cunning and wit.");
			System.out.println("==========================================================");
			Thread.sleep(sleep);
			misc.stopBackgroundMusic();
			quest6();
		}
	}

	public static void quest6()throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		System.out.println();

		System.out.println("=============================================");
		System.out.println("\r\n"
				+ "  ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				+ " ║    █▀▀ █▄░█ █▀▀ ▄▀█ █▀▀ █▀▀   █ █▄░█   ▄▀█   █▀▄ █░█ █▀▀ █░░   █▀█ █▀▀   █▀ ▀█▀ █▀█ ▄▀█ ▀█▀ █▀▀ █▀▀ █▄█    ║\r\n"
				+ "║     ██▄ █░▀█ █▄█ █▀█ █▄█ ██▄   █ █░▀█   █▀█   █▄▀ █▄█ ██▄ █▄▄   █▄█ █▀░   ▄█ ░█░ █▀▄ █▀█ ░█░ ██▄ █▄█ ░█░     ║\r\n"
				+ "║                                                                                                              ║\r\n"
				+ "║                                █░█░█ █ ▀█▀ █░█    ▀█▀ █░█ █▀▀   █▀▀ ▄▀█ █ █▀█ █▄█                            ║\r\n"
				+ " ║                               ▀▄▀▄▀ █ ░█░ █▀█    ░█░ █▀█ ██▄   █▀░ █▀█ █ █▀▄ ░█░                           ║\r\n"
				+ "  ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
		System.out.println();
		System.out.println(
				"Objective: Challenge the Fairy to a game of Rock, Paper, Scissors, testing your intuition and tactical prowess.");
		System.out.println();
		System.out.println(
				"Reward: Receive the Fairy's Blessing, granting you the ability to foresee your opponent's next move in future encounters.");
		System.out.println();
		Thread.sleep(3000);
		System.out.println("===========================================================");
		System.out.println();
		Ascii.fairy();
		System.out.println(
				"They challenge you to a game of Rock, Paper, Scissors that you can’t decline, but beware, for the stakes are high.\nOutsmart the fairy and claim their blessing as your reward.");
		System.out.println();
		System.out.println(
				"🧚Fairy: Well, well, well. What do we have here? Another wandering soul lost amidst the trees?\nOr perhaps a challenger seeking to test their mettle against the likes of me?");
		System.out.println();
		Thread.sleep(3000);

		System.out.println(
				"She twirls gracefully in the air, her laughter tinkling like wind chimes on a gentle breeze.");
		// RPS GAME
		misc.stopBackgroundMusic();
		RPS.playGame(RPG.PLAYER_LIVES);
		misc.stopBackgroundMusic();

		if (RPG.PLAYER_LIVES == 0) {
			System.out.println("Proceeding to checkpoint.....");
			Thread.sleep(5000);
			quest6();
		}

		// if win
		System.out.println();
		System.out.println("=======================");
		Thread.sleep(2000);
		Ascii.fairyBlessing();
		
		System.out.println(	"🧚Fairy: \"Impressive! You have bested me in this contest of wits.\nAs promised, I shall grant you my blessing, that you may navigate the trials ahead with clarity and foresight. I shall accompany you!\"");
		Thread.sleep(sleep);
		System.out.println();

		System.out.println(
				"She sprinkles a dust of shimmering light upon you, and as it settles, you feel a newfound sense of awareness coursing through your veins.");
		misc.playBackgroundMusic("res/sfx/sfx_exp.wav");
				Thread.sleep(5000);
		System.out.println();
		Thread.sleep(3000);
		
		System.out.println();
		RPG.PLAYER_LIVES++;
		misc.playBackgroundMusic("res/sfx/sfx_new_weapon.wav");
		misc.stopBackgroundMusic();
		
		System.out.println("\r\n"
				+ "█▀▀ ▄▀█ █ █▄░█ █▀▀ █▀▄   █▄░█ █▀▀ █░█░█   █▀ █▄▀ █ █░░ █░░ ▀   █▀▀ █▀ █▀█ █▀▀ █▀█\r\n"
				+ "█▄█ █▀█ █ █░▀█ ██▄ █▄▀   █░▀█ ██▄ ▀▄▀▄▀   ▄█ █░█ █ █▄▄ █▄▄ ▄   ██▄ ▄█ █▀▀ ██▄ █▀▄\r\n"
				+ "");
		

		System.out.println(
				"You continue your journey. To your surprise you got back to Eldoria.\nThe town is in disarray getting overrun by goblins.");
		Thread.sleep(2000);
		misc.clearScreen();
		misc.stopBackgroundMusic();
		
		
		
		quest7();
	}

	public static void quest7()throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		
		Thread.sleep(1500);
		
   System.out.println("  ╔══════════════════════════════════════════════════════════════════════════════╗\r\n"
   		+ " ║    █▀▄ █▀▀ █▀▀ █▀▀ █▄░█ █▀▄   █▀▀ █░░ █▀▄ █▀█ █▀█ █ ▄▀█   █▀▀ █▀█ █▀█ █▀▄▀█    ║\r\n"
   		+ "║     █▄▀ ██▄ █▀░ ██▄ █░▀█ █▄▀   ██▄ █▄▄ █▄▀ █▄█ █▀▄ █ █▀█   █▀░ █▀▄ █▄█ █░▀░█     ║\r\n"
   		+ "║                                                                                  ║ \r\n"
   		+ "║       ▀█▀ █░█ █▀▀   █▀▀ █▀█ █▄▄ █░░ █ █▄░█    █ █▄░█ █░█ ▄▀█ █▀ █ █▀█ █▄░█       ║\r\n"
   		+ " ║      ░█░ █▀█ ██▄   █▄█ █▄█ █▄█ █▄▄ █ █░▀█    █ █░▀█ ▀▄▀ █▀█ ▄█ █ █▄█ █░▀█      ║ \r\n"
   		+ "  ╚══════════════════════════════════════════════════════════════════════════════╝");
		// sleep is = 2000
		System.out.println();
		Thread.sleep(sleep);
		System.out.println(
				"Objective: ⚔️ Lead the defense of Eldoria against a horde of rampaging goblins intent on pillaging the town. ⚔️");
		System.out.println();
		Thread.sleep(sleep);
		System.out.println(
				"Reward: Earn the gratitude of the townsfolk and receive the title of Guardian of Eldoria\nAlong with a suit of armor forged from the strongest metals.");
		System.out.println();

		// Battle system rah
		

		int decide;
		int skeletonAttack = 2;
		int skeletonHP = 30;
		boolean validChoice = false;
		System.out.println();

		while (RPG.PLAYER_LIVES > 0 && skeletonHP > 0) {
			System.out.println();
			Ascii.goblin();
			System.out.println("The GOBLIN👺 is approaching!");
			misc.clearScreen();
			Thread.sleep(sleep);
			System.out.println();
			System.out.println();
			Ascii.combatPrompt();
			
			Thread.sleep(sleep);
			while(!validChoice) {
				try {
					decide = scan.nextInt();
					switch (decide) {
					case 1:

						if (evade.nextInt(100) < 20) {
							System.out.println();
							Thread.sleep(3000);
							System.out.println("▄▀█ ▀█▀ ▀█▀ ▄▀█ █▀▀ █▄▀   █▀▄▀█ █ █▀ █▀ █▀▀ █▀▄\r\n"
									         + "█▀█ ░█░ ░█░ █▀█ █▄▄ █░█   █░▀░█ █ ▄█ ▄█ ██▄ █▄▀\r\n"
									+ "");
							misc.playBackgroundMusic("res/sfx/sfx_player_or_enemy_hit.wav");
							Thread.sleep(1000);
							misc.stopBackgroundMusic();
							System.out.println("The goblin took the chance and strikes you!");
							Thread.sleep(sleep);
							
							Thread.sleep(1000);
							System.out.println("Your HP decreased.");
							Thread.sleep(sleep); 
							misc.clearScreen();
							RPG.PLAYER_LIVES -= skeletonAttack;
							validChoice = true;
						} else {
							Thread.sleep(1000);
							misc.playBackgroundMusic("res/sfx/sfx_player_or_enemy_hit.wav");
							Thread.sleep(1000);
			       System.out.println("▀▀█▀▀ █──█ █▀▀ 　 ░█▀▀█ ░█▀▀▀█ ░█▀▀█ ░█─── ▀█▀ ░█▄─░█ 　 █──█ █▀▀█ █▀▀ 　 █▀▀▄ █▀▀ █▀▀ █▀▀▄ 　 ░█─░█ ▀█▀ ▀▀█▀▀ █ \r\n"
									+ "─░█── █▀▀█ █▀▀ 　 ░█─▄▄ ░█──░█ ░█▀▀▄ ░█─── ░█─ ░█░█░█ 　 █▀▀█ █▄▄█ ▀▀█ 　 █▀▀▄ █▀▀ █▀▀ █──█ 　 ░█▀▀█ ░█─ ─░█── ▀ \r\n"
									+ "─░█── ▀──▀ ▀▀▀ 　 ░█▄▄█ ░█▄▄▄█ ░█▄▄█ ░█▄▄█ ▄█▄ ░█──▀█ 　 ▀──▀ ▀──▀ ▀▀▀ 　 ▀▀▀─ ▀▀▀ ▀▀▀ ▀──▀ 　 ░█─░█ ▄█▄ ─░█── ▄\r\n"
									+ "");
							System.out.println("The goblin's HP decreased.");
							
							Thread.sleep(sleep);
							misc.clearScreen();
							skeletonHP -= RPG.PLAYER_DAMAGE;
							validChoice = true;
						}
						break;

					default:
						System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
					}
				}catch(InputMismatchException e){
					System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
					scan.next();
				}

			}
		if (RPG.PLAYER_LIVES <= 0) {
			System.out.println(" \n█▄█ █▀█ █░█   █▀▄ █ █▀▀ █▀▄ █   █▀▀ ▄▀█ █▀▄▀█ █▀▀   █▀█ █░█ █▀▀ █▀█ █  \r\n"
					  +         "  ░█░ █▄█ █▄█   █▄▀ █ ██▄ █▄▀ ▄   █▄█ █▀█ █░▀░█ ██▄   █▄█ ▀▄▀ ██▄ █▀▄ ▄ ");
			System.out.println("Proceeding to checkpoint.....");
			Thread.sleep(5000);
			RPG.PLAYER_LIVES = RPG.RESET_HP;
			quest7();
		}

		// victory
		misc.playBackgroundMusic("res/sfx/sfx_you_win.wav");
		RPG.PLAYER_EXP++;
		RPG.PLAYER_LIVES++;

		System.out.println("\n█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▀▀ ▄▀█ █ █▄░█ █▀▀ █▀▄   █▀▀ ▀▄▀ █▀█ █\r\n"
				           + "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █▄█ █▀█ █ █░▀█ ██▄ █▄▀   ██▄ █░█ █▀▀ ▄");
		System.out.println();
		System.out.println("Current EXP: " + RPG.PLAYER_EXP);
		System.out.println("====================================");
		Thread.sleep(sleep);

		System.out.println("Through sheer determination and unwavering courage, you lead the townsfolk to victory, driving back the goblin invaders\nwith a ferocity that leaves them reeling in defeat. As the last of the goblins flee into the forest, the people of Eldoria erupt into cheers, their gratitude overflowing like a river in flood.");
		System.out.println();
		Thread.sleep(sleep);

		System.out.println("Townsfolk🧑‍🤝‍🧑🫂🫂👯: Our hero! Our savior! You have saved us from certain doom!");

		Thread.sleep(sleep);

		System.out.println(
				"Amidst the jubilation, the mayor approaches you, bearing a suit of armor forged from the finest metals in the land.");
		System.out.println();
		System.out.println(
				"Mayor: \"In recognition of your bravery and valor, we hereby dub you Guardian of Eldoria.\nWear this armor with pride, for it is a symbol of our eternal gratitude.\"");
		RPG.PLAYER_LIVES++;
				System.out.println("\n█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▀▀ ▄▀█ █ █▄░█ █▀▀ █▀▄   ▄▀█   █▄░█ █▀▀ █░█░█   ▄▀█ █▀█ █▀▄▀█ █▀█ █▀█ █\r\n"
						           + "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █▄█ █▀█ █ █░▀█ ██▄ █▄▀   █▀█   █░▀█ ██▄ ▀▄▀▄▀   █▀█ █▀▄ █░▀░█ █▄█ █▀▄ ▄\r\n"
						+ "");

		Thread.sleep(sleep);

		System.out.println("The fairy applauds your victory, her laughter like tinkling bells in the breeze.");
		System.out.println("Fairy: “Let’s go hero we have a lot more on our back\"");
		System.out.println();
		System.out.println("========================================");

		int choice;
		System.out.println("The fairy led you to the outskirts of Eldoria.");
		System.out.print(
				"Fairy: I sense that this ruin holds the key for you to get what you want. Shall we continue?\n[1] Yes [2] No");
	
		boolean choiceyValid = false;
		while(!choiceyValid) {
			if(scan.hasNextInt()) {
				choice = scan.nextInt();
				switch (choice) {
				case 1:
					misc.clearScreen();
					misc.stopBackgroundMusic();
					quest8();
					break;

				case 2:
					misc.clearScreen();
					misc.stopBackgroundMusic();
					quest9();
					break;
				
					default:
						System.out.print("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
						
				}
			}else {
				System.out.print("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
				scan.next();
			}
			
			
			
		}
		
		}
	}

	public static void quest8()
			throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		misc.playBackgroundMusic("res/mus_storymode.wav");
		Thread.sleep(1500);
		System.out.println("\r\n"
				+ "  ╔════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				+ " ║   █░█ █▄░█ █▀▀ █▀█ █░█ █▀▀ █▀█   ▀█▀ █░█ █▀▀   █▀ █▀▀ █▀▀ █▀█ █▀▀ ▀█▀ █▀   █▀█ █▀▀   ║\r\n"
				+ "║    █▄█ █░▀█ █▄▄ █▄█ ▀▄▀ ██▄ █▀▄   ░█░ █▀█ ██▄   ▄█ ██▄ █▄▄ █▀▄ ██▄ ░█░ ▄█   █▄█ █▀░    ║\r\n"
				+ "║                                                                                        ║\r\n"
				+ "║             ▀█▀ █░█ █▀▀    ▄▀█ █▄░█ █▀▀ █ █▀▀ █▄░█ ▀█▀   █▀█ █░█ █ █▄░█ █▀             ║\r\n"
				+ " ║            ░█░ █▀█ ██▄    █▀█ █░▀█ █▄▄ █ ██▄ █░▀█ ░█░   █▀▄ █▄█ █ █░▀█ ▄█            ║\r\n"
				+ "  ╚════════════════════════════════════════════════════════════════════════════════════╝");
		

		System.out.println("Objective:Explore the mysterious ruins on the outskirts of Eldoria.");
		System.out.println();
		System.out.println(
				"Reward: Discover ancient artifacts imbued with mystical powers, enhancing your abilities in combat and magic.");
		System.out.println();
		Thread.sleep(3000);
		System.out.println("===========================================================");

		System.out.println(
				"\nAs you venture deeper into the outskirts of Eldoria, the ancient ruins rise before you like silent sentinels of a forgotten era.\nMoss-covered stones and crumbling pillars bear witness to the passage of time, hinting at the secrets that lie buried within.");
		Thread.sleep(sleep);
		System.out.println(
				"In the dim light of dusk, you stumble upon a hidden chamber, its entrance obscured by vines and ivy.\n With a sense of trepidation and excitement, you push aside the foliage and step into the darkness beyond.");
		System.out.println();

		RPG.PLAYER_LIVES++;
		Thread.sleep(1500);
		misc.playBackgroundMusic("res/sfx/sfx_new_weapon.wav");
	                     System.out.println("█▄█ █▀█ █░█   █░█ ▄▀█ █░█ █▀▀   █▀▀ ▄▀█ █ █▄░█ █▀▀ █▀▄   ▄▀█   █▄░█ █▀▀ █░█░█   ▄▀█ █▀█ █▀▄▀█ █▀█ █▀█   ▀    █▀█ █ █▄░█ █▀▀\r\n"
				                          + "░█░ █▄█ █▄█   █▀█ █▀█ ▀▄▀ ██▄   █▄█ █▀█ █ █░▀█ ██▄ █▄▀   █▀█   █░▀█ ██▄ ▀▄▀▄▀   █▀█ █▀▄ █░▀░█ █▄█ █▀▄   ▄    █▀▄ █ █░▀█ █▄█\r\n"
				+ "");
	

		System.out.println();

		int choice;
		System.out.println(
				" As you delve deeper into the ruins, you come upon a hidden door concealed within the shadows.");
		System.out.println("Carved with ancient symbols and glyphs, it beckons you to uncover its mysteries.");
		System.out.print("What will you do? [1] Go in [2] Go Back : ");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			misc.clearScreen();
			misc.stopBackgroundMusic();
			quest9();

		case 2:
			misc.clearScreen();
			misc.stopBackgroundMusic();
			quest10();
		}

	}

	public static void quest9()
			throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		misc.playBackgroundMusic("res/mus_storymode.wav");
		Thread.sleep(1500);
		     System.out.println("\r\n"
		     		+ "  ╔════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
		     		+ " ║    █▄░█ ▄▀█ █░█ █ █▀▀ ▄▀█ ▀█▀ █▀▀   ▀█▀ █░█ █▀▀   █░░ ▄▀█ █▄▄ █▄█ █▀█ █ █▄░█ ▀█▀ █░█     ║\r\n"
		     		+ "║     █░▀█ █▀█ ▀▄▀ █ █▄█ █▀█ ░█░ ██▄   ░█░ █▀█ ██▄   █▄▄ █▀█ █▄█ ░█░ █▀▄ █ █░▀█ ░█░ █▀█      ║\r\n"
		     		+ "║                                                                                            ║\r\n"
		     		+ "║                            █▀█ █▀▀   █ █░░ █░░ █░█ █▀ █ █▀█ █▄░█ █▀                        ║\r\n"
		     		+ " ║                           █▄█ █▀░   █ █▄▄ █▄▄ █▄█ ▄█ █ █▄█ █░▀█ ▄█                       ║\r\n"
		     		+ "  ╚════════════════════════════════════════════════════════════════════════════════════════╝");
		
			Thread.sleep(sleep);
			Ascii.labyrinthDoor();

			System.out.println();
			System.out.println("================================================");
			System.out.println(
					"Objective: Brave the treacherous Labyrinth of Illusions, a maze filled with endless quizzes.");
			Thread.sleep(sleep);

			// QUIZ GAMES
			System.out.println("Left, right, above, below. You work tirelessly throughout the maze.");
			Thread.sleep(sleep);
			Ascii.mazeMoving();
			WordGuess.playGame();

			System.out.println("Left, right, above, below. You work tirelessly throughout the maze.");
			Thread.sleep(sleep);
			Ascii.mazeMoving();
			MathQuiz.playGame();

			System.out.println("Left, right, above, below. You work tirelessly throughout the maze.");
			Thread.sleep(sleep);
			Ascii.mazeMoving();
			WordGuess.playGame();

			System.out.println("Left, right, above, below. You work tirelessly throughout the maze.");
			Thread.sleep(sleep);
			Ascii.mazeMoving();
			Quiz.startQuiz();

			Thread.sleep(sleep);
			System.out.println();
			System.out.println(
					"You have reached the end of the maze and was led to another room filled with treasures. But only one artifact caught your eye.");
			Thread.sleep(sleep);
		
		if (RPG.PLAYER_LIVES <= 0) {
			System.out.println(" \n█▄█ █▀█ █░█   █▀▄ █ █▀▀ █▀▄ █   █▀▀ ▄▀█ █▀▄▀█ █▀▀   █▀█ █░█ █▀▀ █▀█ █  \r\n"
					  +         "  ░█░ █▄█ █▄█   █▄▀ █ ██▄ █▄▀ ▄   █▄█ █▀█ █░▀░█ ██▄   █▄█ ▀▄▀ ██▄ █▀▄ ▄ ");
			System.out.println("Proceeding to checkpoint.....");
			Thread.sleep(5000);
			RPG.PLAYER_LIVES +=10;
			quest8();
		}
		
		
		
		System.out.println("\n█▀▀ ▄▀█ █ █▄░█   █▄░█ █▀▀ █░█░█   ▄▀█ █▀█ ▀█▀ █ █▀▀ ▄▀█ █▀▀ ▀█▀ ▀   ▄▀█ █▀▄▀█ █░█ █░░ █▀▀ ▀█▀   █▀█ █▀▀    █▀▀ █░░ ▄▀█ █▀█ █ ▀█▀ █▄█ ▀   \r\n"
				           + "█▄█ █▀█ █ █░▀█   █░▀█ ██▄ ▀▄▀▄▀   █▀█ █▀▄ ░█░ █ █▀░ █▀█ █▄▄ ░█░ ▄   █▀█ █░▀░█ █▄█ █▄▄ ██▄ ░█░   █▄█ █▀░    █▄▄ █▄▄ █▀█ █▀▄ █ ░█░ ░█░ ░\r\n"
				+ "\r\n"
				+ "▄█▄ █ █▀▄▀█ █▀▄▀█ █░█ █▄░█ █ ▀█▀ █▄█   ▀█▀ █▀█   █▀▀ █ █▀█ █▀▀\r\n"
				+ "░▀░ █ █░▀░█ █░▀░█ █▄█ █░▀█ █ ░█░ ░█░   ░█░ █▄█   █▀░ █ █▀▄ ██▄");
		Thread.sleep(sleep);
		misc.clearScreen();
		misc.stopBackgroundMusic();
		quest10();

	}

	public static void quest10()
			throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		misc.playBackgroundMusic("res/mus_storymode.wav");
		Thread.sleep(sleep);
		System.out.println("==============================================================");
		Thread.sleep(sleep);
		System.out.println("\nYou get back to town and brave yourself for the final challenge.");
		Thread.sleep(sleep);
		System.out.println(
				"Continuing on the path that the fairy leads, you eventually arrive at the gates of a grand castle, its towering spires reaching towards the heavens.\nGuarded by towering sentinels, the castle exudes an air of solemn majesty, hinting at the mysteries that lie within.");
		Thread.sleep(sleep);

		System.out.println();

		System.out.println("==============================================================");
		Thread.sleep(sleep);

		System.out.println(
				"Approaching the gates, you're met by an unexpected sight: the hermit who had initially implored your aid, now adorned in regal attire,\nhis countenance transformed into that of a wise and benevolent ruler.");
		Thread.sleep(sleep);

		System.out.println("==============================================================");

		System.out.println();

		System.out.println(
				"King: \"Welcome, traveler, to the realm of Arcania. I am King Meph, and I have long awaited your arrival.\"");

		Thread.sleep(3000);

		System.out.println();

		System.out.println("Your heart quickens with anticipation.");

		System.out.println();

		Thread.sleep(sleep);

		System.out.println(
				"King: \"You have shown great courage and cunning in your journey thus far, but the greatest trial still lies ahead.\nBefore you stand the ultimate challenge: to face the fearsome dragon that threatens to engulf our land in shadow.\"");

		Thread.sleep(sleep);

		System.out.println(
				"With a solemn nod, you steel yourself for the final showdown, knowing that victory is within your grasp.\nBut before you embark on this perilous quest, the king offers you one last opportunity to prepare for the battle ahead.");

		misc.clearScreen();
		misc.stopBackgroundMusic();
		questFinal();

	}

	// body ng class

	public static void questFinal()
			throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
		misc.playBackgroundMusic("res/sfx/mus_boss_battle.wav");
		RPG.PLAYER_LIVES+=20;
		RPG.PLAYER_DAMAGE+=10;
		
		Thread.sleep(1500);
		 System.out.println("\n╔════════════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
							+ "║                                                                                                ║\r\n"
							+ "║          █▀▀ █▀█ █▄░█ █▀▀ █▀█ █▀█ █▄░█ ▀█▀   ▀█▀ █░█ █▀▀   █▀▄ █▀█ ▄▀█ █▀▀ █▀█ █▄░█ ░          ║\r\n"
							+ "║          █▄▄ █▄█ █░▀█ █▀░ █▀▄ █▄█ █░▀█ ░█░   ░█░ █▀█ ██▄   █▄▀ █▀▄ █▀█ █▄█ █▄█ █░▀█ █          ║\r\n"
							+ "║                                                                                                ║\r\n"
							+ "║          █▀▀ █░█ ▄▀█ █▀█ █▀▄ █ ▄▀█ █▄░█   █▀█ █▀▀   █▀▀ █░░ █▀▄ █▀█ █▀█ █ ▄▀█                  ║\r\n"
							+ "║          █▄█ █▄█ █▀█ █▀▄ █▄▀ █ █▀█ █░▀█   █▄█ █▀░   ██▄ █▄▄ █▄▀ █▄█ █▀▄ █ █▀█                  ║ \r\n"
							+ "║                                                                                                ║\r\n"
							+ "╚════════════════════════════════════════════════════════════════════════════════════════════════╝");
		Thread.sleep(sleep);

		System.out.println();

		Thread.sleep(sleep);
		System.out.println(
				"Objective: Venture into the depths of the Dragon's Lair and face the ultimate challenge in a battle against the mighty Dragon.");
		System.out.println();
		Thread.sleep(sleep);
		System.out.println(
				"Reward: Claim the Dragon's Treasures, a trove of riches and powerful artifacts that will secure your legacy as the hero of Arcania and get you back to the real world.");

		System.out.println("========================");

		System.out.println(
				"With the Dragon's Lair looming before you, you steel yourself for the ultimate challenge.\nThe ground shakes as the mighty dragon emerges, its scales shimmering in the dim light.\nWith courage and determination, you prepare to face your destiny and secure the future of Arcania\n");

		System.out.println();
		Thread.sleep(sleep);
		System.out.println(
				"As you stand on the precipice of destiny, the dragon looming before you like a harbinger of chaos, you draw upon every ounce of strength and courage within you.\nWith a mighty roar, the battle begins, a clash of titans that reverberates throughout the land.");

		System.out.println();
		RPG.displayLives();
		// BATTLE SCENE
		
		
		int dragonDamage = 2;
		
		// dragonskills
		int fireBreath = 1;
		int fireBreathTickDamage = 1;
		int cosmicNovaBurst = 100;
		int dragonHP = 50;
		
		
		while(RPG.PLAYER_LIVES > 0 && dragonHP > 0) {
			Ascii.combatPrompt();
			
			 boolean valid = false;
			 int choice;
			 while(!valid) {
				
				 if(scan.hasNextInt()) {
					 choice = scan.nextInt();
					 if(choice == 1) {
						 
						 
						 
						  System.out.println("█▄█ █▀█ █░█ ▀ █░█ █▀▀   ▄▀█ ▀█▀ ▀█▀ ▄▀█ █▀▀ █▄▀ █▀▀ █▀▄   ▀█▀ █░█ █▀▀   █▀▄ █▀█ ▄▀█ █▀▀ █▀█ █▄░█ █\r\n"
	                                + "░█░ █▄█ █▄█ ░ ▀▄▀ ██▄   █▀█ ░█░ ░█░ █▀█ █▄▄ █░█ ██▄ █▄▀   ░█░ █▀█ ██▄   █▄▀ █▀▄ █▀█ █▄█ █▄█ █░▀█ ▄\r\n"
	                                + "");
	                        dragonHP -=10;
	                        System.out.println();
	                        System.out.println("The dragon approached you!!");
	                       RPG.getLives(dragonHP);
	                        valid = true;
	                        
	                        
	                        
	                        if (evade.nextInt(50) < 50) {
	                        	Thread.sleep(2000);
	                            System.out.println();
	                            Ascii.dragonBreath();
	                            System.out.println("▀▀█▀▀ ░█─░█ ░█▀▀▀ 　 ░█▀▀▄ ░█▀▀█ ─█▀▀█ ░█▀▀█ ░█▀▀▀█ ░█▄─░█ 　 ░█─░█ ░█▀▀▀█ ░█▀▀▀ ░█▀▀▄ 　 ░█▀▀▀ ▀█▀ ░█▀▀█ ░█▀▀▀   ░█▀▀█ ░█▀▀█ ░█▀▀▀ ─█▀▀█ ▀▀█▀▀ ░█─░█ █ █ \r\n"
	                                + "─░█── ░█▀▀█ ░█▀▀▀ 　 ░█─░█ ░█▄▄▀ ░█▄▄█ ░█─▄▄ ░█──░█ ░█░█░█ 　 ░█─░█ ─▀▀▀▄▄ ░█▀▀▀ ░█─░█ 　 ░█▀▀▀ ░█─ ░█▄▄▀ ░█▀▀▀   ░█▀▀▄ ░█▄▄▀ ░█▀▀▀ ░█▄▄█ ─░█── ░█▀▀█ ▀ ▀ \r\n"
	                                + "─░█── ░█─░█ ░█▄▄▄ 　 ░█▄▄▀ ░█─░█ ░█─░█ ░█▄▄█ ░█▄▄▄█ ░█──▀█ 　 ─▀▄▄▀ ░█▄▄▄█ ░█▄▄▄ ░█▄▄▀ 　 ░█─── ▄█▄ ░█─░█ ░█▄▄▄   ░█▄▄█ ░█─░█ ░█▄▄▄ ░█─░█ ─░█── ░█─░█ ▄ ▄\r\n"
	                                + "");
	                            RPG.PLAYER_LIVES -= fireBreath;
	                            RPG.PLAYER_LIVES -= fireBreathTickDamage;
	                            System.out.println();
	                            System.out.println("\r\n"
	                                + "█▄█ █▀█ █░█   ▄▀█ █▀█ █▀▀   █▄▄ █░█ █▀█ █▄░█ █ █▄░█ █▀▀ █   █▀█ █▀▀ █▀▀ █▀▀ █ █░█ █▀▀   ▄█   █▀▄ ▄▀█ █▀▄▀█ ▄▀█ █▀▀ █▀▀    █▀█ █▀▀ █▀█   ▀█▀ █░█ █▀█ █▄░█ █\r\n"
	                                + "░█░ █▄█ █▄█   █▀█ █▀▄ ██▄   █▄█ █▄█ █▀▄ █░▀█ █ █░▀█ █▄█ ▄   █▀▄ ██▄ █▄▄ ██▄ █ ▀▄▀ ██▄   ░█   █▄▀ █▀█ █░▀░█ █▀█ █▄█ ██▄    █▀▀ ██▄ █▀▄   ░█░ █▄█ █▀▄ █░▀█ ▄\r\n"
	                                + "");
	                            RPG.displayLives();
	                            RPG.getLives(dragonHP);
	                           
	                        } else if (evade.nextInt(80) < 20) {
	                        	Thread.sleep(2000);
	                          
	                            System.out.println("\r\n"
	                                + "▀▀█▀▀ ▒█░▒█ ▒█▀▀▀ 　 ▒█▀▀▄ ▒█▀▀█ ░█▀▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▄░▒█ 　 ▒█░▒█ ▒█▀▀▀█ ▒█▀▀▀ ▒█▀▀▄\r\n"
	                                + "░▒█░░ ▒█▀▀█ ▒█▀▀▀ 　 ▒█░▒█ ▒█▄▄▀ ▒█▄▄█ ▒█░▄▄ ▒█░░▒█ ▒█▒█▒█ 　 ▒█░▒█ ░▀▀▀▄▄ ▒█▀▀▀ ▒█░▒█\r\n"
	                                + "░▒█░░ ▒█░▒█ ▒█▄▄▄ 　 ▒█▄▄▀ ▒█░▒█ ▒█░▒█ ▒█▄▄█ ▒█▄▄▄█ ▒█░░▀█ 　 ░▀▄▄▀ ▒█▄▄▄█ ▒█▄▄▄ ▒█▄▄▀\r\n"
	                                + "\r\n"
	                                + "▒█▀▀█ ▒█▀▀▀ ▀▀█▀▀ ▒█▀▀█ ▀█▀ ▒█▀▀▀ ▒█░░▒█ ▀█▀ ▒█▄░▒█ ▒█▀▀█ 　 ▒█▀▀█ ░█▀▀█ ▒█▀▀▀█ ▒█▀▀▀ █ \r\n"
	                                + "▒█▄▄█ ▒█▀▀▀ ░▒█░░ ▒█▄▄▀ ▒█░ ▒█▀▀▀ ▒█▄▄▄█ ▒█░ ▒█▒█▒█ ▒█░▄▄ 　 ▒█░▄▄ ▒█▄▄█ ░▄▄▄▀▀ ▒█▀▀▀ ▀ \r\n"
	                                + "▒█░░░ ▒█▄▄▄ ░▒█░░ ▒█░▒█ ▄█▄ ▒█░░░ ░░▒█░░ ▄█▄ ▒█░░▀█ ▒█▄▄█ 　 ▒█▄▄█ ▒█░▒█ ▒█▄▄▄█ ▒█▄▄▄ ▄\r\n"
	                                + "");
	                            RPG.PLAYER_LIVES -= dragonDamage;
	                            RPG.getLives(dragonHP);
	                            RPG.displayLives();
	                          
	                            System.out.println();
	                        } else if (evade.nextInt(5) < 95) {
	                        	Thread.sleep(2000);
	                            System.out.println("\r\n"
	                                + "▀▀█▀▀ ▒█░▒█ ▒█▀▀▀ 　 ▒█▀▀▄ ▒█▀▀█ ░█▀▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▄░▒█ 　 ▒█░▒█ ▒█▀▀▀█ ▒█▀▀▀ ▒█▀▀▄\r\n"
	                                + "░▒█░░ ▒█▀▀█ ▒█▀▀▀ 　 ▒█░▒█ ▒█▄▄▀ ▒█▄▄█ ▒█░▄▄ ▒█░░▒█ ▒█▒█▒█ 　 ▒█░▒█ ░▀▀▀▄▄ ▒█▀▀▀ ▒█░▒█\r\n"
	                                + "░▒█░░ ▒█░▒█ ▒█▄▄▄ 　 ▒█▄▄▀ ▒█░▒█ ▒█░▒█ ▒█▄▄█ ▒█▄▄▄█ ▒█░░▀█ 　 ░▀▄▄▀ ▒█▄▄▄█ ▒█▄▄▄ ░▀▄▄▀\r\n"
	                                + "\r\n"
	                                + "▒█▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▄▀█ ▀█▀ ▒█▀▀█   ▒█▄░▒█ ▒█▀▀▀█ ▒█░░▒█ ░█▀▀█ 　 ▒█▀▀█ ▒█░▒█ ▒█▀▀█ ▒█▀▀▀█ ▀▀█▀▀ \r\n"
	                                + "▒█░░░ ▒█░░▒█ ░▀▀▀▄▄ ▒█▒█▒█ ▒█░ ▒█░░░   ▒█▒█▒█ ▒█░░▒█ ░▒█▒█░ ▒█▄▄█ 　 ▒█▀▀▄ ▒█░▒█ ▒█▄▄▀ ░▀▀▀▄▄ ░▒█░░ \r\n"
	                                + "▒█▄▄█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█░░▒█ ▄█▄ ▒█▄▄█   ▒█░░▀█ ▒█▄▄▄█ ░░▀▄▀░ ▒█░▒█ 　 ▒█▄▄█ ░▀▄▄▀ ▒█░▒█ ▒█▄▄▄█ ░▒█░░");
	                            RPG.PLAYER_LIVES -= cosmicNovaBurst;
	                            RPG.getLives(dragonHP);
	                            RPG.displayLives();
	                            System.out.println("You died instantly");
	                            Thread.sleep(1000);
	                            System.out.println(".");
	                            Thread.sleep(1000);
	                            System.out.println(".");
	                            Thread.sleep(1000);
	                            System.out.println(".");
	                            Thread.sleep(1000);
	                            System.out.println(".");
	                            Thread.sleep(1000);
	                            System.out.println(".");
	                            Thread.sleep(1000);
	                            System.out.println(".");
	                            Thread.sleep(1000);
	                            misc.clearScreen();
	                            quest1();
	                        }
						 
	                        if (dragonHP == 0) {
	                            Thread.sleep(2000);
	                            misc.clearScreen();
	                            misc.stopBackgroundMusic();
	                            victory();
	                            valid = true;
	                        }
					 }else{
						 System.out.println("Enter again");// choice if else
						
					 }
					 
					 
					 
				 }else {
					 System.out.println("Enter again");
					 scan.next();
				 } // scan has next if else
				 
			 } // vald loop
		
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while (RPG.PLAYER_LIVES > 0 || dragonHP > 0) {
//		    System.out.println("WHAT WILL U DO? ");
//		    Ascii.combatPrompt();
//		    int choice;
//		    boolean valid = false; // Resetting the validity flag for each iteration of the loop
//
//		    while (!valid) {
//		        if (scan.hasNextInt()) {
//		            choice = scan.nextInt();
//		            if (choice == 1) {
//		                switch (choice) {
//		                    case 1:
//		                        System.out.println("█▄█ █▀█ █░█ ▀ █░█ █▀▀   ▄▀█ ▀█▀ ▀█▀ ▄▀█ █▀▀ █▄▀ █▀▀ █▀▄   ▀█▀ █░█ █▀▀   █▀▄ █▀█ ▄▀█ █▀▀ █▀█ █▄░█ █\r\n"
//		                                + "░█░ █▄█ █▄█ ░ ▀▄▀ ██▄   █▀█ ░█░ ░█░ █▀█ █▄▄ █░█ ██▄ █▄▀   ░█░ █▀█ ██▄   █▄▀ █▀▄ █▀█ █▄█ █▄█ █░▀█ ▄\r\n"
//		                                + "");
//		                        dragonHP -=10;
//		                        System.out.println();
//		                        System.out.println("The dragon approached you!!");
//		                        if (evade.nextInt(50) < 50) {
//		                            
//		                            System.out.println();
//		                            Ascii.dragonBreath();
//		                            System.out.println("▀▀█▀▀ ░█─░█ ░█▀▀▀ 　 ░█▀▀▄ ░█▀▀█ ─█▀▀█ ░█▀▀█ ░█▀▀▀█ ░█▄─░█ 　 ░█─░█ ░█▀▀▀█ ░█▀▀▀ ░█▀▀▄ 　 ░█▀▀▀ ▀█▀ ░█▀▀█ ░█▀▀▀   ░█▀▀█ ░█▀▀█ ░█▀▀▀ ─█▀▀█ ▀▀█▀▀ ░█─░█ █ █ \r\n"
//		                                + "─░█── ░█▀▀█ ░█▀▀▀ 　 ░█─░█ ░█▄▄▀ ░█▄▄█ ░█─▄▄ ░█──░█ ░█░█░█ 　 ░█─░█ ─▀▀▀▄▄ ░█▀▀▀ ░█─░█ 　 ░█▀▀▀ ░█─ ░█▄▄▀ ░█▀▀▀   ░█▀▀▄ ░█▄▄▀ ░█▀▀▀ ░█▄▄█ ─░█── ░█▀▀█ ▀ ▀ \r\n"
//		                                + "─░█── ░█─░█ ░█▄▄▄ 　 ░█▄▄▀ ░█─░█ ░█─░█ ░█▄▄█ ░█▄▄▄█ ░█──▀█ 　 ─▀▄▄▀ ░█▄▄▄█ ░█▄▄▄ ░█▄▄▀ 　 ░█─── ▄█▄ ░█─░█ ░█▄▄▄   ░█▄▄█ ░█─░█ ░█▄▄▄ ░█─░█ ─░█── ░█─░█ ▄ ▄\r\n"
//		                                + "");
//		                            RPG.PLAYER_LIVES -= fireBreath;
//		                            RPG.PLAYER_LIVES -= fireBreathTickDamage;
//		                            System.out.println();
//		                            System.out.println("\r\n"
//		                                + "█▄█ █▀█ █░█   ▄▀█ █▀█ █▀▀   █▄▄ █░█ █▀█ █▄░█ █ █▄░█ █▀▀ █   █▀█ █▀▀ █▀▀ █▀▀ █ █░█ █▀▀   ▄█   █▀▄ ▄▀█ █▀▄▀█ ▄▀█ █▀▀ █▀▀    █▀█ █▀▀ █▀█   ▀█▀ █░█ █▀█ █▄░█ █\r\n"
//		                                + "░█░ █▄█ █▄█   █▀█ █▀▄ ██▄   █▄█ █▄█ █▀▄ █░▀█ █ █░▀█ █▄█ ▄   █▀▄ ██▄ █▄▄ ██▄ █ ▀▄▀ ██▄   ░█   █▄▀ █▀█ █░▀░█ █▀█ █▄█ ██▄    █▀▀ ██▄ █▀▄   ░█░ █▄█ █▀▄ █░▀█ ▄\r\n"
//		                                + "");
//		                            RPG.displayLives();
//		                            RPG.getLives(dragonHP);
//		                            System.out.println("WHAT WILL U DO? ");
//		                            Ascii.combatPrompt();
//		                        } else if (evade.nextInt(80) < 20) {
//		                          
//		                            System.out.println("\r\n"
//		                                + "▀▀█▀▀ ▒█░▒█ ▒█▀▀▀ 　 ▒█▀▀▄ ▒█▀▀█ ░█▀▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▄░▒█ 　 ▒█░▒█ ▒█▀▀▀█ ▒█▀▀▀ ▒█▀▀▄\r\n"
//		                                + "░▒█░░ ▒█▀▀█ ▒█▀▀▀ 　 ▒█░▒█ ▒█▄▄▀ ▒█▄▄█ ▒█░▄▄ ▒█░░▒█ ▒█▒█▒█ 　 ▒█░▒█ ░▀▀▀▄▄ ▒█▀▀▀ ▒█░▒█\r\n"
//		                                + "░▒█░░ ▒█░▒█ ▒█▄▄▄ 　 ▒█▄▄▀ ▒█░▒█ ▒█░▒█ ▒█▄▄█ ▒█▄▄▄█ ▒█░░▀█ 　 ░▀▄▄▀ ▒█▄▄▄█ ▒█▄▄▄ ▒█▄▄▀\r\n"
//		                                + "\r\n"
//		                                + "▒█▀▀█ ▒█▀▀▀ ▀▀█▀▀ ▒█▀▀█ ▀█▀ ▒█▀▀▀ ▒█░░▒█ ▀█▀ ▒█▄░▒█ ▒█▀▀█ 　 ▒█▀▀█ ░█▀▀█ ▒█▀▀▀█ ▒█▀▀▀ █ \r\n"
//		                                + "▒█▄▄█ ▒█▀▀▀ ░▒█░░ ▒█▄▄▀ ▒█░ ▒█▀▀▀ ▒█▄▄▄█ ▒█░ ▒█▒█▒█ ▒█░▄▄ 　 ▒█░▄▄ ▒█▄▄█ ░▄▄▄▀▀ ▒█▀▀▀ ▀ \r\n"
//		                                + "▒█░░░ ▒█▄▄▄ ░▒█░░ ▒█░▒█ ▄█▄ ▒█░░░ ░░▒█░░ ▄█▄ ▒█░░▀█ ▒█▄▄█ 　 ▒█▄▄█ ▒█░▒█ ▒█▄▄▄█ ▒█▄▄▄ ▄\r\n"
//		                                + "");
//		                            RPG.PLAYER_LIVES -= dragonDamage;
//		                            RPG.getLives(dragonHP);
//		                            RPG.displayLives();
//		                            System.out.println("WHAT WILL U DO? ");
//		                            Ascii.combatPrompt();
//		                            System.out.println();
//		                        } else if (evade.nextInt(5) < 95) {
//		                         
//		                            System.out.println("\r\n"
//		                                + "▀▀█▀▀ ▒█░▒█ ▒█▀▀▀ 　 ▒█▀▀▄ ▒█▀▀█ ░█▀▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▄░▒█ 　 ▒█░▒█ ▒█▀▀▀█ ▒█▀▀▀ ▒█▀▀▄\r\n"
//		                                + "░▒█░░ ▒█▀▀█ ▒█▀▀▀ 　 ▒█░▒█ ▒█▄▄▀ ▒█▄▄█ ▒█░▄▄ ▒█░░▒█ ▒█▒█▒█ 　 ▒█░▒█ ░▀▀▀▄▄ ▒█▀▀▀ ▒█░▒█\r\n"
//		                                + "░▒█░░ ▒█░▒█ ▒█▄▄▄ 　 ▒█▄▄▀ ▒█░▒█ ▒█░▒█ ▒█▄▄█ ▒█▄▄▄█ ▒█░░▀█ 　 ░▀▄▄▀ ▒█▄▄▄█ ▒█▄▄▄ ░▀▄▄▀\r\n"
//		                                + "\r\n"
//		                                + "▒█▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▄▀█ ▀█▀ ▒█▀▀█   ▒█▄░▒█ ▒█▀▀▀█ ▒█░░▒█ ░█▀▀█ 　 ▒█▀▀█ ▒█░▒█ ▒█▀▀█ ▒█▀▀▀█ ▀▀█▀▀ \r\n"
//		                                + "▒█░░░ ▒█░░▒█ ░▀▀▀▄▄ ▒█▒█▒█ ▒█░ ▒█░░░   ▒█▒█▒█ ▒█░░▒█ ░▒█▒█░ ▒█▄▄█ 　 ▒█▀▀▄ ▒█░▒█ ▒█▄▄▀ ░▀▀▀▄▄ ░▒█░░ \r\n"
//		                                + "▒█▄▄█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█░░▒█ ▄█▄ ▒█▄▄█   ▒█░░▀█ ▒█▄▄▄█ ░░▀▄▀░ ▒█░▒█ 　 ▒█▄▄█ ░▀▄▄▀ ▒█░▒█ ▒█▄▄▄█ ░▒█░░");
//		                            RPG.PLAYER_LIVES -= cosmicNovaBurst;
//		                            RPG.getLives(dragonHP);
//		                            RPG.displayLives();
//		                            System.out.println("You died instantly");
//		                            Thread.sleep(1000);
//		                            System.out.println(".");
//		                            Thread.sleep(1000);
//		                            System.out.println(".");
//		                            Thread.sleep(1000);
//		                            System.out.println(".");
//		                            Thread.sleep(1000);
//		                            System.out.println(".");
//		                            Thread.sleep(1000);
//		                            System.out.println(".");
//		                            Thread.sleep(1000);
//		                            System.out.println(".");
//		                            Thread.sleep(1000);
//		                            misc.clearScreen();
//		                            quest1();
//		                        }
//		                        if (dragonHP == 0) {
//		                            Thread.sleep(2000);
//		                            misc.clearScreen();
//		                            misc.stopBackgroundMusic();
//		                            victory();
//		                        }
//		                        break; // Exiting the switch statement after processing choice 1
//		                }
//		            } else {
//		                System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
//		            }
//		        } else {
//		            System.out.println("I don't understand your choice, adventurer. What are you implying? Perhaps you could be more clear?");
//		            scan.next(); // Consume the invalid input
//		        }
//		        valid = true; // Setting valid to true only after processing the input
//		    }
//		    break;
//		}		
//
//		RPG.displayLives();
		
		
		
		
		
		
		

		if (RPG.PLAYER_LIVES <= 0) {
			System.out.println(
					"As the battle against the mighty dragon reaches its climax, your strength wanes, and exhaustion threatens to overwhelm you.");
			System.out.println(
					"With a ferocious roar, the dragon unleashes a devastating blast of fire, its searing heat washing over you like a wave of death.");
			System.out.println();
			Thread.sleep(sleep);
			System.out.println(
					"In that moment of desperation, you realize that victory may be beyond your grasp. Your limbs feel heavy, your breath ragged, and with each beat of your heart, the darkness of defeat looms closer.");
			System.out.println(
					"The dragon's fiery breath consumes you, and as the world fades into oblivion, you are left with only the bitter taste of defeat.");
			Thread.sleep(sleep);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			misc.clearScreen();
			quest1();

		}

		

	}

	public static void victory() throws InterruptedException {
		misc.playBackgroundMusic("res/sfx/mus_ending_theme.wav");

		System.out.println();
		Thread.sleep(sleep);
		System.out.println(
				"With each strike of your blade and every incantation of your spells, you draw closer to victory, your resolve unyielding in the face of adversity.\nThe dragon, once a fearsome adversary, now falters beneath the weight of your onslaught, its fiery breath dimming with each passing moment.");
		System.out.println();
		Thread.sleep(sleep);
		System.out.println(
				"And then, with a final, triumphant blow, you strike the decisive blow, the dragon collapsing in a thunderous roar as darkness yields to light once more.\nThe realm of Arcania is saved, its people free from the shadow of tyranny.");

		System.out.println(
				"As you bask in the aftermath of your victory, a shimmering portal materializes before you, a gateway back to the world you once knew.\nWith a final glance at the land you've come to cherish, you step through the portal, the memories of your journey etched forever in your heart.");

		System.out.println(
				"After your victory and the triumphant return to the real world, you find yourself back in the familiar confines of the classroom.\nHowever, something is different this time. As you glance around, you realize that the classroom looks exactly as it did when the semester first began");

		System.out.println(
				"With a sense of disbelief and wonder, you realize that you've been given a second chance—a chance to relive the semester and make things right from the beginning.\n Armed with the knowledge and experiences gained from your epic journey, you embark on this new adventure with a renewed sense of purpose and determination.\r\n"
						+ "");
		
		Thread.sleep(3000);
		ending();
		
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
	}
	
	public static void ending() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("\r\n"
				+ "\r\n"
				+ "████████╗██╗░░██╗███████╗  ███████╗███╗░░██╗██████╗░░░░░░░░░░\r\n"
				+ "╚══██╔══╝██║░░██║██╔════╝  ██╔════╝████╗░██║██╔══██╗░░░░░░░░░\r\n"
				+ "░░░██║░░░███████║█████╗░░  █████╗░░██╔██╗██║██║░░██║░░░░░░░░░\r\n"
				+ "░░░██║░░░██╔══██║██╔══╝░░  ██╔══╝░░██║╚████║██║░░██║░░░░░░░░░\r\n"
				+ "░░░██║░░░██║░░██║███████╗  ███████╗██║░╚███║██████╔╝██╗██╗██╗\r\n"
				+ "░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚══════╝╚═╝░░╚══╝╚═════╝░╚═╝╚═╝╚═╝\r\n"
				+ "");
		
		Thread.sleep(5000);
System.out.println("██╗██╗░█████╗░██████╗░░█████╗░░█████╗░███╗░░██╗██╗░█████╗░██╗██╗░░░░░░██████╗░██╗░░░██╗░░░░░░░░░\r\n"
				+ "╚█║╚█║██╔══██╗██╔══██╗██╔══██╗██╔══██╗████╗░██║██║██╔══██╗╚█║╚█║░░░░░░██╔══██╗╚██╗░██╔╝░░░░░░░░░\r\n"
				+ "░╚╝░╚╝███████║██████╔╝██║░░╚═╝███████║██╔██╗██║██║███████║░╚╝░╚╝░░░░░░██████╦╝░╚████╔╝░░░░░░░░░░\r\n"
				+ "░░░░░░██╔══██║██╔══██╗██║░░██╗██╔══██║██║╚████║██║██╔══██║░░░░░░░░░░░░██╔══██╗░░╚██╔╝░░░░░░░░░░░\r\n"
				+ "░░░░░░██║░░██║██║░░██║╚█████╔╝██║░░██║██║░╚███║██║██║░░██║░░░░░░░░░░░░██████╦╝░░░██║░░░██╗██╗██╗\r\n"
				+ "░░░░░░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝╚═╝░░╚═╝░░░░░░░░░░░░╚═════╝░░░░╚═╝░░░╚═╝╚═╝╚═╝\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "▀█▀ █▀█ █ █▀ █▀▀ █ ▄▀█   ░░█ █▀█ █▄█ █▀▀ █▀▀   █▀▀ ░   █▀▀ ▄▀█ █▄▄ █▀▀ █░░ █░░ █▀█\r\n"
				+ "░█░ █▀▄ █ ▄█ █▄▄ █ █▀█   █▄█ █▄█ ░█░ █▄▄ ██▄   █▄▄ ▄   █▄▄ █▀█ █▄█ ██▄ █▄▄ █▄▄ █▄█\r\n"
				+ "\r\n"
				+ "█▀▀ ▀█▀ █░█ ▄▀█ █▄░█   █▀▀ █▀█ █▀▀ █▄█   █░░ ░   █▀▀ █▀▀ █▀█ █▄░█ ▄▀█ █▄░█ █▀▄ █▀▀ ▀█\r\n"
				+ "██▄ ░█░ █▀█ █▀█ █░▀█   █▄█ █▀▄ ██▄ ░█░   █▄▄ ▄   █▀░ ██▄ █▀▄ █░▀█ █▀█ █░▀█ █▄▀ ██▄ █▄\r\n"
				+ "\r\n"
				+ "░░█ █░█ █░░ █ █░█ █▀   █▀▄▀█ ░   █░░ █░█ █▀▀ █ █▀█\r\n"
				+ "█▄█ █▄█ █▄▄ █ █▄█ ▄█   █░▀░█ ▄   █▄▄ █▄█ █▄▄ █ █▄█\r\n"
				+ "\r\n"
				+ "█░█ █▀▀ █▀█ █▀█   █▄▄ ░   █▀█ █▀▀ ▀█▀ █░█ █▀▀ █▀█ █▀▄▀█ ▄▀█\r\n"
				+ "█▀█ ██▄ █▀▄ █▄█   █▄█ ▄   █▀▄ ██▄ ░█░ █▄█ ██▄ █▀▄ █░▀░█ █▀█\r\n"
				+ "\r\n"
				+ "░░█ ▄▀█ █▀▄▀█ █▀▀ █▀   ▄▀█ ░   █▀ ▄▀█ █░░ █▀▀ █▀▀ █▀▄ █▀█\r\n"
				+ "█▄█ █▀█ █░▀░█ ██▄ ▄█   █▀█ ▄   ▄█ █▀█ █▄▄ █▄▄ ██▄ █▄▀ █▄█\r\n"
				+ "\r\n"
				+ "░░█ █▀▀ █▀ █░█ █▀▄▀█ █ █▄░█   █▀▄▀█ ░   ▀█▀ ▄▀█ █▄░█ ▄▀█ █▀▀ █░░\r\n"
				+ "█▄█ ██▄ ▄█ █▀█ █░▀░█ █ █░▀█   █░▀░█ ▄   ░█░ █▀█ █░▀█ █▀█ ██▄ █▄▄");
					
	}

}// end ng class wag lagpasan
