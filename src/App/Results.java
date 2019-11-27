package App;
import java.util.Scanner;
public class Results {
	
	public static double percentage(double physMark, double chemMark, double bioMark) {
		return ((physMark+chemMark+bioMark)*100)/450;
	}
	
	public static double physPercentage(double physMark) {
		return (physMark*100)/150;
	}
	
	public static double chemPercentage(double chemMark) {
		return (chemMark*100)/150;
	}
	
	public static double bioPercentage(double bioMark) {
		return (bioMark*100)/150;
	}
	
	public static int totMark(int physMark, int chemMark, int bioMark) {
		return physMark + chemMark + bioMark;
	}
	
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter your physics score: ");
		int physMark = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your chemistry score: ");
		int chemMark = input2.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter your biology score: ");
		int bioMark = input3.nextInt();
		
		
		
		System.out.println("Physics mark is: " + physMark);
		System.out.println("Chemistry mark is: " + chemMark);
		System.out.println("Biology mark is: " + bioMark);
		System.out.println("Total mark is: " + totMark(physMark, chemMark, bioMark));
		System.out.println("Total percentage is: " + percentage(physMark,chemMark,bioMark) + "%");
		
		String failed = "You have failed: ";
		
		if (physPercentage(physMark) < 60) {
			System.out.println(failed + "physics.");
		} 
		
		if (chemPercentage(chemMark) < 60) {
			System.out.println(failed + "chemistry.");
		} 
		
		if (bioPercentage(bioMark) < 60) {
			System.out.println(failed + "biology.");
		} 
		
		
		if (percentage(physMark, chemMark, bioMark) < 60) {
			System.out.println("You have failed!");
		} 
		
		if (percentage(physMark, chemMark, bioMark) >= 60 && bioPercentage(bioMark) >= 60 && chemPercentage(chemMark) >= 60 && physPercentage(physMark) >= 60) {
			System.out.println("Well done! You passed");
		}
		
	}
}
