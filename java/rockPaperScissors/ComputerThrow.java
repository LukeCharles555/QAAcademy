package rockPaperScissors;

import java.util.Random;

public class ComputerThrow {

	static RPS randThrow() {
		int pick = new Random().nextInt(RPS.values().length);
		return RPS.values()[pick];
	}
}
