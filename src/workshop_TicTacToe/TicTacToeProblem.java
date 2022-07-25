package workshop_TicTacToe;

import java.util.Scanner;

public class TicTacToeProblem {

	public static void main(String[] args) {
		/*
		 * printing the welcome message calling method uc1
		 */

		System.out.println("Welocome to Tic-tac-Toe GAME....");

		uc1();

		/*
		 * printing the statement to get user's choice and then calling method uc2
		 */

		System.out.println("Please choose your option X or O...");
		System.out.println("Please enter 1 for X & 2 for O....");

		uc2();
	}

	static void uc1() {
		/*
		 * defining char array keep 0th index blank defining rest of the elements
		 */
		char[] arr = new char[10];
		arr[0] = ' ';
		for (int i = 1; i < 10; i++) {
			arr[i] = ' ';
		}
	}

	static void uc2() {
		/*
		 * using scanner taking input from the user using if else the player choice is
		 * defined
		 */
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a == 1) {
			System.out.println("User got X...");
			System.out.println("Computer got O...");

		} else {
			System.out.println("User got O...");
			System.out.println("Computer got X...");

		}

	}

}
