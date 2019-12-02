package seatPlan;

import java.util.ArrayList;

import seatPlan.Randomizer;

public class NameArray {
	static String[] names = { "Neeven", "Luke P", "Jess", "James B", "Alwin", "Chloe", "Euan", "Ewan", "Harris", "John",
			"Liam", "Lizzie", "Tigs", "Alex", "Zohaib", "Luke C", "Adam", "Luke H", "Rebekah", "Matt", "Anthony",
			"James K", "Chris" };

	public static ArrayList<String> nameShuffler() {
		ArrayList<String> shuffledNames = new ArrayList<>();
		Integer[] indexes = Randomizer.arrayShuffler();
		for (int i = 0; i < 23; i++) {
			shuffledNames.add(names[indexes[i]]);
		}
		return shuffledNames;
	}
}
