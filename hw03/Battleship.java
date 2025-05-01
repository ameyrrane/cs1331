import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {

		System.out.println("Welcome to Battleship!");

		// Take user inputs for ship coordinates
		// print the board representating players ship locations

		char[][] player1 = inputShipCoordinate("PLAYER 1");
		printBattleShip(player1);

		char[][] player2 = inputShipCoordinate("PLAYER 2");
		printBattleShip(player2);

		startBattle(player1, player2);

	}

	// Use this method to store coordinates for the player.
	private static char[][] inputShipCoordinate(String name) {

		System.out.println(name + ", ENTER YOUR SHIP'S COORDINATES.");

		final int MAX_ROW = 5;
		final int MAX_COL = 5;

		char[][] ship = getblankShip(MAX_ROW, MAX_COL);
		Scanner input = new Scanner(System.in);

		int entries = 5;
		int row, col;

		// Take user inputs and validate them before entering into 2d array.
		for (int i = 0; i < entries; i++) {

			System.out.printf("Enter ship %d location:\n", (i + 1));
			do {
				row = input.nextInt();
				col = input.nextInt();
				if ((row < 0 || row > 4) || (col < 0 || col > 4)) {
					System.out.println("Invalid coordinates. Choose different coordinates.");
				} else if (ship[row][col] == '@') {
					System.out.println("You already have a ship there. Choose a different coordinate.");
				}

			} while ((row < 0 || row > 4) || (col < 0 || col > 4) || ship[row][col] == '@');
			ship[row][col] = '@';

		}

		return ship;

	}

	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
		// for (int i = 0; i < 100; i++) {

		// System.out.println();

		// }
	}

	// method for battle between two players.
	private static void startBattle(char[][] player1, char[][] player2) {

		// sunk count is used to track how many ships were destroyed by opposite player.
		int sunkCount1 = 0;
		int sunkCount2 = 0;
		final int MAX_ROW = 5;
		final int MAX_COL = 5;

		// Initialize two target array with default value of '-'.
		char[][] hitsOnPlayer1 = getblankShip(MAX_ROW, MAX_COL);
		char[][] hitsOnPlayer2 = getblankShip(MAX_ROW, MAX_COL);

		final int winCount = 5;

		while (true) {

			// Get valid target from the user and check whehter attack was successful or
			// not.
			int[] targetByP1 = giveValidTarget("Player 1", hitsOnPlayer2);

			if (player2[targetByP1[0]][targetByP1[1]] == '@') {
				System.out.println("PLAYER 1 HIT PLAYER 2's SHIP!");
				hitsOnPlayer2[targetByP1[0]][targetByP1[1]] = 'X';
				player2[targetByP1[0]][targetByP1[1]] = 'X';
				sunkCount1++;
				printBattleShip(hitsOnPlayer2);
				if (sunkCount1 == winCount)
					break;
			} else {
				System.out.println("PLAYER 1 MISSED!");
				hitsOnPlayer2[targetByP1[0]][targetByP1[1]] = '0';
				player2[targetByP1[0]][targetByP1[1]] = '0';
				printBattleShip(hitsOnPlayer2);
			}

			int[] firedhitsOnPlayer2 = giveValidTarget("Player 2", hitsOnPlayer1);

			if (player1[firedhitsOnPlayer2[0]][firedhitsOnPlayer2[1]] == '@') {
				System.out.println("PLAYER 2 HIT PLAYER 1's SHIP!");
				hitsOnPlayer1[firedhitsOnPlayer2[0]][firedhitsOnPlayer2[1]] = 'X';
				player1[targetByP1[0]][targetByP1[1]] = 'X';
				sunkCount2++;
				printBattleShip(hitsOnPlayer1);
				if (sunkCount2 == winCount)
					break;
			} else {
				System.out.println("PLAYER 2 MISSED!");
				hitsOnPlayer1[firedhitsOnPlayer2[0]][firedhitsOnPlayer2[1]] = '0';
				player1[targetByP1[0]][targetByP1[1]] = '0';
				printBattleShip(hitsOnPlayer1);
			}

		}

		if (sunkCount1 == winCount) {
			System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIP");
		} else {
			System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIP");
		}

		// Print final boards with space for readability.
		System.out.println();
		System.out.println("Final boards:");
		System.out.println();
		printBattleShip(player1);
		System.out.println();
		printBattleShip(player2);

	}

	private static char[][] getblankShip(int x, int y) {

		char[][] ship = new char[x][y];
		for (int i = 0; i < ship.length; i++) {
			for (int j = 0; j < ship[0].length; j++) {
				ship[i][j] = '-';
			}
		}

		return ship;

	}

	private static int[] giveValidTarget(String name, char[][] target) {
		int row, col;
		do {

			System.out.printf("%s, enter hit row/column\n", name);
			Scanner input = new Scanner(System.in);

			row = input.nextInt();
			col = input.nextInt();

			if (row < 0 || row > 4 || col < 0 || col > 4) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
			} else if (target[row][col] == '0' || target[row][col] == 'X') {
				System.out.println("You already fired on this spot. Choose different coordinates.");
			}

		} while (row < 0 || row > 4 || col < 0 || col > 4 || target[row][col] == '0' || target[row][col] == 'X');

		int[] targetArray = { row, col };

		return targetArray;
	}
}