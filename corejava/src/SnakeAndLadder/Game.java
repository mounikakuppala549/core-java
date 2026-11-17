package SnakeAndLadder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// =====================================================
//                  SNAKE AND LADDER
// =====================================================
//
// Game Rules:
// 1. Press ENTER to roll the dice.
// 2. The player must reach position 100 to win.
// 3. If the position exceeds 100, the turn is skipped.
// 4. Landing on a ladder moves the player upward.
// 5. Landing on a snake moves the player downward.
// 6. Rolling a 6 gives the player another turn.
//
// =====================================================

public class Game {

	public static void startGame(List<Player> playerlist) {

		System.out.println("\n=====================================");
		System.out.println("         SNAKE AND LADDER GAME       ");
		System.out.println("=====================================");
		System.out.println("Game Started!");

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// ---------------- LADDERS ----------------

		HashMap<Integer, Integer> ladder = new HashMap<>();

		ladder.put(5, 30);
		ladder.put(15, 40);
		ladder.put(23, 98);
		ladder.put(36, 70);
		ladder.put(50, 80);

		// ---------------- SNAKES -----------------

		HashMap<Integer, Integer> snakes = new HashMap<>();

		snakes.put(99, 9);
		snakes.put(90, 35);
		snakes.put(78, 55);
		snakes.put(66, 17);
		snakes.put(72, 26);

		// ---------------- GAME SETUP ----------------

		int currentIndex = 0;

		// ---------------- GAME LOOP -----------------

		while (true) {

			Player player = playerlist.get(currentIndex);

			System.out.println("\n=====================================");
			System.out.println("Player Turn : " + player.getName());
			System.out.println("Current Position : " + player.getPosition());
			System.out.println("Please press ENTER to roll the dice!");

			scanner.nextLine();

			// Roll the dice (1 to 6)
			int dice = random.nextInt(6) + 1;
			int temp = dice;
			int sixcount = 0;

			System.out.println("\nDice Value : " + dice);

			// Calculate the new position
			int newPosition = player.getPosition() + dice;

			// Check whether the position exceeds 100
			if (newPosition > 100) {

				System.out.println("Your turn is skipped because the position exceeds 100!");

			} else {

				sixcount++;

				// Check for a ladder
				if (ladder.containsKey(newPosition)) {

					System.out.println("\nCongratulations! You found a ladder!");
					System.out.println("Jumping from " + newPosition + " to " + ladder.get(newPosition));

					player.setPosition(ladder.get(newPosition));

					System.out.println("Current Position : " + player.getPosition());

				}

				// Check for a snake
				else if (snakes.containsKey(newPosition)) {

					System.out.println("\nOops! A snake bit you!");
					System.out.println("Moving from " + newPosition + " to " + snakes.get(newPosition));

					player.setPosition(snakes.get(newPosition));

					System.out.println("Current Position : " + player.getPosition());

				}

				// Normal movement
				else {

					player.setPosition(newPosition);

					System.out.println("Current Position : " + player.getPosition());
				}

				// Check whether the player has won
				if (player.getPosition() == 100) {

					System.out.println("\n=====================================");
					System.out.println("Current Position : " + player.getPosition());
					System.out.println("WOW! Congratulations, " + player.getName() + "! YOU WON THE GAME!");
					System.out.println("=====================================");

					break;
				}
			}

			// Give another turn if the dice value is 6
			if (temp == 6 && sixcount <= 3) {

				System.out.println("\nYou rolled a 6! You can play again!");

				continue;
			}

			// Move to the next player
			currentIndex = (currentIndex + 1) % playerlist.size();
		}
	}
}

// =====================================================
//                       PLAYER
// =====================================================

class Player {

	private String name;
	private int position;

	// Constructor
	public Player(String name) {

		this.name = name;
		this.position = 0;
	}

	// Get player name
	public String getName() {

		return name;
	}

	// Set player name
	public void setName(String name) {

		this.name = name;
	}

	// Get player position
	public int getPosition() {

		return position;
	}

	// Set player position
	public void setPosition(int position) {

		this.position = position;
	}

	// Display player details
	@Override
	public String toString() {

		return "Player [name=" + name + ", position=" + position + "]";
	}

	// =================================================
	// MAIN
	// =================================================

	public static void main(String[] args) {

		// Create players
		Player p1 = new Player("Sandhya");
		Player p2 = new Player("Anu");

		// Add players to the list
		List<Player> playerlist = new ArrayList<>();

		playerlist.add(p1);
		playerlist.add(p2);

		// Start the game
		Game.startGame(playerlist);
	}
}
