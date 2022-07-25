package workshop_TicTacToe;

import java.util.Scanner;

public class TicTacToeProblem {
	
	public static char[] board;

	public static void main(String[] args) {
		/*
		 * printing the welcome message calling method uc1
		 */

		System.out.println("Welocome to Tic-tac-Toe GAME....");

		uc1();

		/*
		 * printing the statement to get user's choice and then calling method uc2
		 * calling uc3
		 */

		System.out.println("Please choose your option X or O...");
		System.out.println("Please enter 1 for X & 2 for O....");

		uc2();
		
		System.out.println("TicTacToe board ....");
		
		uc3();
	}

	static void uc1() {
		/*
		 * defining board array keep 0th index blank defining rest of the elements
		 */
		board  = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
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
	
	public static void uc3() {
		
        for (int i = 1; i <= board.length - 1; i++) {
            if (i == 3 || i == 6 || i == 9) {
                System.out.println(board[i]);
            } else {
                System.out.print(board[i] + "_" + "|" +"_");
            }
        }
    }
	

}