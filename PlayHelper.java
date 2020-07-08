import java.util.Random;
import java.util.Scanner;

public class PlayHelper {
	// for random number
	Random r = new Random();

	/*
	 * This is a method named ComputerChoice with a random numbers and in this
	 * method it will ask the computer to choose the random number between 0 to 1
	 */
	public static String ComputerChoice(Random r) {

		// get a random number
		int Number = r.nextInt(2);

		String Answer = "";

		// This is switch case which will help the computer to choose the numbers
		switch (Number) {

		// case 0 is assigned as a Rock
		case 0:
			Answer = "Rock";
			// it will break the loop
			break;

		// case 1 is assigned as a Paper
		case 1:
			Answer = "Paper";
			// break the loop
			break;

		// case 2 is assigned as a Scissors
		case 2:
			Answer = "Scissors";
			// It will break the loop
			break;
		}
		// return the answer
		return Answer;

	}

	public static String getuserInput(Scanner kb) {
		System.out.print(
				"Your choices: \n      Rock \n      Paper \n      Scissors \n      Stop \nplease enter your choice: ");
		String choice = kb.nextLine();

		// to print the Rock
		if (choice.equalsIgnoreCase("Rock")) {
			return choice;
		}

		// to print the paper
		else if (choice.equalsIgnoreCase("Paper")) {
			return choice;
		}

		// to print the Scissors
		else if (choice.equalsIgnoreCase("Scissors")) {
			return choice;
		}

		// to print the stop
		else if (choice.equalsIgnoreCase("Stop")) {
			return choice;
		}

		// if the user enter the invalid input then
		// it will ask the use to enter it again
		else {
			System.out.println("unknown selection");
			System.out.println();
			// It will call the whole method
			choice = getuserInput(kb);
		}

		System.out.println();
		System.out.println();
		// return the choice
		return choice;

	}
}

