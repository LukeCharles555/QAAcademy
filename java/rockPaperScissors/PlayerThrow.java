package rockPaperScissors;

public class PlayerThrow {

	static RPS playerThrow(String pThrow) {
		RPS playerThrow = null;
		switch (pThrow) {
		case "ROCK":
			playerThrow = RPS.ROCK;
			break;
		case "PAPER":
			playerThrow = RPS.PAPER;
			break;
		case "SCISSORS":
			playerThrow = RPS.SCISSORS;
			break;
		}
		return playerThrow;
	}
}
