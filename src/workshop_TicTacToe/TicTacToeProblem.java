package workshop_TicTacToe;

public class TicTacToeProblem {

	public static void main(String[] args) {
/*
 * printing the welcome message
 * calling method uc1
 */
		System.out.println("Welocome to Tic-tac-Toe GAME....");

		uc1();
	}

	static void uc1() {
/*
 * defining char array
 * keep 0th index blank
 * defining rest of the elements
 */
		char[] arr = new char[10];
		arr[0] = ' ';
		for (int i = 1; i < 10; i++) {
			arr[i] = ' ';
		}
	}

}
