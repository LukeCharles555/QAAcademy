package tests;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import rockPaperScissors.Compare;
import rockPaperScissors.RPS;



public class RockPaperScissorsTest {

	@Test
	public void compareTest() {
		Compare compare = new Compare();
		String result = compare.compare(RPS.ROCK, RPS.PAPER);
		String result2 = compare.compare(RPS.ROCK, RPS.SCISSORS);
		String result3 = compare.compare(RPS.ROCK, RPS.ROCK);
		
		String result4 = compare.compare(PAPER, ROCK);
		String result5 = compare.compare(PAPER, SCISSORS);
		String result6 = compare.compare(PAPER, PAPER);
		
		String result7 = compare.compare(SCISSORS, PAPER);
		String result8 = compare.compare(SCISSORS, ROCK);
		String result9 = compare.compare(SCISSORS, SCISSORS);
		Assert.assertEquals("Congratulations! You beat the machine!", result2);
		Assert.assertEquals("Congratulations! You beat the machine!", result7);
		Assert.assertEquals("Congratulations! You beat the machine!", result4);
		Assert.assertEquals("Unlucky, the machines got you this time :(", result);
		Assert.assertEquals("Unlucky, the machines got you this time :(", result5);
		Assert.assertEquals("Unlucky, the machines got you this time :(", result8);
		Assert.assertEquals("You tied!", result3);
		Assert.assertEquals("You tied!", result6);
		Assert.assertEquals("You tied!", result9);

	}

}
