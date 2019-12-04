package rockPaperScissors;

import java.util.Scanner;

public class Game {

	public static String game() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose what to throw (ROCK, PAPER, SCISSORS): ");
		String pThrow = scan.nextLine();
		scan.close();
		RPS playerThrow;
		RPS computerThrow = ComputerThrow.randThrow();
		String resultMessage = "";
		if (pThrow.equals("ROCK") || pThrow.equals("PAPER") || pThrow.equals("SCISSORS")) {
			playerThrow = PlayerThrow.playerThrow(pThrow);
			Result result = Compare.compare(playerThrow, computerThrow);
			System.out.println("You threw: " + playerThrow + "\nThe computer threw: " + computerThrow);
			switch (result) {
			case WIN:
				resultMessage = "Congratulations! You beat the machine!";
				break;
			case LOSE:
				resultMessage = "Unlucky, the machines got you this time :(";
				break;
			case DRAW:
				resultMessage = "You tied!";
				break;
			}
		} else {
			resultMessage = "Please enter a valid Rock Paper Scissors throw";
		}
		return resultMessage;
	}
}
