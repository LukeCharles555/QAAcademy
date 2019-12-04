package rockPaperScissors;

public class Compare {

	public static Result compare(RPS playerThrow, RPS computerThrow) {
		if (playerThrow == RPS.ROCK) {
			if (computerThrow == RPS.ROCK) {
				return Result.DRAW;
			} else if (computerThrow == RPS.PAPER) {
				return Result.LOSE;
			} else if (computerThrow == RPS.SCISSORS) {
				return Result.WIN;
			}
		} else if (playerThrow == RPS.PAPER) {
			if (computerThrow == RPS.ROCK) {
				return Result.WIN;
			} else if (computerThrow == RPS.PAPER) {
				return Result.DRAW;
			} else if (computerThrow == RPS.SCISSORS)  {
				return Result.LOSE;
			}
		} else if (playerThrow == RPS.SCISSORS){
			if (computerThrow == RPS.ROCK) {
				return Result.LOSE;
			} else if (computerThrow == RPS.PAPER) {
				return Result.WIN;
			} else if (computerThrow == RPS.SCISSORS)  {
				return Result.DRAW;
			}
		}
		return null;
	}
}
