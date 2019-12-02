package seatPlan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Randomizer {
	public static Integer[] arrayShuffler() {

		Integer[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
		List<Integer> intList = Arrays.asList(intArray);
		Collections.shuffle(intList);
		intList.toArray(intArray);
		return intArray;
	}
}
