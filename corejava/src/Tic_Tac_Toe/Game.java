package Tic_Tac_Toe;

import java.util.Scanner;

public class Game {

	static Scanner sc = new Scanner(System.in);

//	 Declaring a 2D character array to create an empty Tic Tac Toe board 
	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

//	print board method to print the Tic Tac Toe board 
	static void printBoard() {
		for (int i = 0; i < board.length; i++) {
			System.out.println("----------------");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(" | " + board[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println("----------------");
	}

//	mark board method to mark the board with players symbols
	static void markBoard(int player, char symbol) {

		boolean stop = false;
		while (!stop) {
			int choice = sc.nextInt();
			int n = 1;
			boolean mark = false;
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					if (n == choice) {
						if (board[i][j] == ' ') {
							board[i][j] = symbol;
							stop = true;
							mark = true;
							break;
						} else {
							System.out.println("==========================================================");
							System.out.println("arey already mark aiy undhi 🤯");
							System.out.println("correct number ni enter chai 🧐 (1-9)");
							System.out.println("==========================================================");
							mark = true;
							break;
						}
					}

					n++;
				}
				if (mark) {
					break;
				}
			}
		}

		printBoard();

	}

//	check board method to check row, cols and diagonals after entering the choice
	static boolean checkBoard(char symbol) {

		// Check rows
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
				return true;
			}
		}

		// Check columns
		for (int i = 0; i < 3; i++) {
			if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
				return true;
			}
		}

		// Check diagonals
		if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
			return true;
		}

		if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
			return true;
		}

		return false;
	}

	static void resetBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = ' ';
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("**************************** Welcome To Tic_Tac_Toe Game ****************************");

		boolean stop = false;
		while (!stop) {
			System.out.println("_____________________________________________________________________________________");
			printBoard();

			System.out.print("Enter Player 1 Name : ");
			String player1 = sc.next();

			System.out.print("Enter Player 2 Name : ");
			String player2 = sc.next();

			int steps = 0;

			while (steps < 9) {
				System.out.print(player1 + " Enter your choice from (1-9) : ");
				markBoard(1, 'x');
				steps++;

				if (checkBoard('x')) {
					System.out.println(player1 + " you won the match 🎉🥳👏");
					break;
				}

				if (steps == 9) {
					System.out.println("==========================================================");
					System.out.println("-------match draw-------");
					System.out.println("==========================================================");
					break;
				}

				System.out.print(player2 + " Enter your choice from (1-9) : ");
				markBoard(2, 'O');
				steps++;
				if (checkBoard('O')) {
					System.out.println("==========================================================");
					System.out.println(player2 + " you won the match 🎉🥳👏");
					System.out.println("==========================================================");
					break;
				}

			}

			System.out.println("Do you want to play again..! ('y' or 'n')");
			if (sc.next().equalsIgnoreCase("n")) {
				stop = true;
			}
			resetBoard();
		}
	}

}