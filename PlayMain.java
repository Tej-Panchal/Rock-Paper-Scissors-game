import java.util.Scanner;
import java.util.Random;

public class PlayMain {

	public static void main(String[] args) {

		// scanner kb
		Scanner kb = new Scanner(System.in);

		// This is a boolean named choice.
		// it will assigned as a true value
		boolean choice = true;

		// While loop which calls the other methods of the class
		while (choice) {

			// Call Description method
			Description();
			// Call Play method
			Play();

			/*
			 * It will ask the user that he want to paly gain or not if yes then it will do
			 * the same things as done before and if no then it will break the loop
			 */
			System.out.print("Do you want to play again? ");
			String ans = kb.nextLine();

			// If else statement to run the program again
			if (ans.equalsIgnoreCase("yes")) {
				choice = true;
			} else if (ans.equalsIgnoreCase("no")) {
				System.out.print("GOOD BYE. COME BACK SOON");
				// break the loop
				break;
			}
		}
	}

	// This is a Description method which will gives the summary of the game
	public static void Description() {
		System.out.println(
				"Using this app you can play Rock-Paper-Scissors game against the \ncomputer. When played between two people, each person picks one of \nthe three options at the same time, and the winner is determined. The \nprogram should randomly choose one of the three options, then prompt \nfor the user’s selection. At that point, the program reveals both \nchoices and print a statement indicating if the user won, the \ncomputer won, or if it was a tie. Continue playing until the user \nchoose to stop. Then print the total number of the games played, \ntotal wins, total losses, and total ties. \n\nReady, Set, Go");
		System.out.println();
	}

	/*
	 * Method named Play, run the program by calls the other methods from the
	 * helper class and then it will start the game after asking the user of its
	 * choice
	 */
	public static void Play() {
		// Random assigned as a r
		Random r = new Random();
		int Win = 0;
		int Lose = 0;
		int Tie = 0;
		int Time = 0;

		// This is while loop and in this loop it will return the program if its true
		while (true) {

			Scanner kb = new Scanner(System.in);

			// Give the name user to getuserInput method from helper class
			String user = PlayHelper.getuserInput(kb);
			// Give the name com to ComputerChoice method from helper class
			String Com = PlayHelper.ComputerChoice(r);

			// If you write Stop then it will break the loop
			if (user.equalsIgnoreCase("Stop")) {
				break;
			}

			// It will shows which you selected and which choice computer selected
			System.out.println("Computer selected: " + Com);
			System.out.println("You selected: " + user);

			// If statement for user's win
			if (((user.equalsIgnoreCase("Rock")) && (Com.equalsIgnoreCase("Scissors")))
					|| ((user.equalsIgnoreCase("Paper")) && (Com.equalsIgnoreCase("Rock")))
					|| ((user.equalsIgnoreCase("Scissors")) && (Com.equalsIgnoreCase("Paper")))) {

				Win++;
				System.out.println("Hurray! You won.");
			}

			// If statement for Tie between User and Computer
			else if (((user.equalsIgnoreCase("Rock")) && (Com.equalsIgnoreCase("Rock")))
					|| ((user.equalsIgnoreCase("Paper")) && (Com.equalsIgnoreCase("Paper")))
					|| ((user.equalsIgnoreCase("Scissors")) && (Com.equalsIgnoreCase("Scissors")))) {

				Tie++;
				System.out.println("There is a tie");
			}

			// If statement for Computer's win and your lose
			else if (((user.equalsIgnoreCase("Scissors")) && (Com.equalsIgnoreCase("Rock")))
					|| ((user.equalsIgnoreCase("Rock")) && (Com.equalsIgnoreCase("Paper")))
					|| ((user.equalsIgnoreCase("Paper")) && (Com.equalsIgnoreCase("Scissors")))) {
				Lose++;
				System.out.println("Oh No, you lost");
			}

			Time++;
		}

		/*
		 * This is gives the scores how amny times you paly the game and how many times
		 * you win, lose and tie
		 */
		System.out.println("-----------------------------------");
		System.out.println("Here is the result of the play:");
		System.out.println("Times played:		" + Time);
		System.out.println("Wins:			" + Win);
		System.out.println("Losses:			" + Lose);
		System.out.println("Ties:			" + Tie);

		// If you win the game then it will give you congratuation
		if (Win > Lose) {
			System.out.println("Congratulations! You won.");
		}

		// If you lose the game then it says sorry
		else if (Win < Lose) {
			System.out.println("Sorry computer won this time. Try again");
		}

		// If both you and computer has same score it will tie the game
		else {
			System.out.println("It's a tie");
		}

		System.out.println("------------------------------------");

	}

}
