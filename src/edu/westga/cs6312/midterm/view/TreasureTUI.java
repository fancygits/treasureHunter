package edu.westga.cs6312.midterm.view;

import java.util.Scanner;

import edu.westga.cs6312.midterm.model.GameBoard;

/**
 * Defines the Treasure Text User Interface class
 * @author James Luke Johnson
 * @version 2018.02.16
 */
public class TreasureTUI {
	private GameBoard gameBoard;
	private Scanner input;
	
	/**
	 * Constructs a new TreasureTUI object
	 * @param gameBoard	A GameBoard object
	 */
	public TreasureTUI(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
		this.input = new Scanner(System.in);
	}
	
	/**
	 * Starts the TreasureTUI application
	 */
	public void run() {
		System.out.println("Welcome to the Treasure Hunter Application");
		this.menu();
	}
	
	/**
	 * Helper method display the menuOptions and get the menuChoice
	 */
	private void menu() {
		int choice = 0;
		do {
			this.menuOptions();
			choice = this.getUserInt("Please enter your choice: ");
			this.menuChoices(choice);
		} while (choice != 9);
	}
	
	/**
	 * Helper method with the menu choices
	 */
	private void menuOptions() {
		System.out.println();
		System.out.println("1 - Describe the room");
		System.out.println("2 - Describe the player");
		System.out.println("3 - Describe the game board");
		System.out.println("4 - Move");
		System.out.println("5 - Open Treasure");
		System.out.println("9 - Quit");
	}

	/**
	 * Helper method to run methods based on userInt
	 * @param choice	An int from getUserInt()
	 */
	private void menuChoices(int choice) {
		switch (choice) {
			case 1: this.describeRoom(); 		break;
			case 2: this.describePlayer(); 		break;
			case 3: this.describeGameBoard(); 	break;
			case 4: this.move(); 				break;
			case 5: this.checkTreasure();		break;
			case 9: this.quitGame(); 			break;
			default:System.out.println("\nThat's not a valid option. Please try again.");
		}
	}

	/**
	 * Helper method to display a message and convert the input to an int
	 * @param message	The message to display to the user
	 * @return			An int parsed from the String input
	 */
	private int getUserInt(String message) {
		System.out.print(message);
		return Integer.parseInt(this.input.nextLine());
	}
	
	/**
	 * Helper method to describe the current room
	 */
	private void describeRoom() {
		System.out.println(this.gameBoard.getCurrentRoom().toString());
	}
	
	/**
	 * Helper method to describe the player and remaining money
	 */
	private void describePlayer() {
		System.out.println(this.gameBoard.getPlayer().toString());
	}
	
	/**
	 * Helper method to describe the game board
	 */
	private void describeGameBoard() {
		System.out.println(this.gameBoard.toString());
	}
	
	/**
	 * Quits the game
	 */
	private void quitGame() {
		System.out.println("\nThanks for looking for treasure with us. Goodbye!");
		System.exit(0);
	}
	
	/**
	 * Moves the player left or right
	 */
	private void move() {
		System.out.println("1 - Left");
		System.out.println("2 - Right");
		int choice = this.getUserInt("Please enter the direction: ");
		if (choice == 1) {
			this.gameBoard.moveLeft();
		} else if (choice == 2) {
			this.gameBoard.moveRight();
		} else {
			System.out.println("That's not a valid direction");
			return;
		}
		System.out.println("The player is now in " + this.gameBoard.getCurrentRoom().toString());
	}
	
	/**
	 * Checks if the room contains a treasure chest and player has enough money
	 * 
	 * Precondition:	Treasure chest must exist
	 * 					Player must have enough money (50) to open the chest
	 * Postcondition: 	Treasure chest is opened
	 */
	private void checkTreasure() {
		if (this.gameBoard.getCurrentRoom().getTreasure() == null) {
			System.out.println("Sorry. There is no treasure in this room.");
			return;
		} else if (this.gameBoard.getPlayer().getMoneyRemaining() < 50) {
			System.out.println("Not enough money to open the treasure");
		} else {
			this.gameBoard.getPlayer().deductMoney(50);
			this.openTreasure();
		}
	}
	
	/**
	 * Opens the treasure chest in the room and delivers payment to the player
	 */
	private void openTreasure() {
		int payment = this.gameBoard.getCurrentRoom().getTreasure().deliverPayment();
		this.gameBoard.getPlayer().acceptMoney(payment);
		System.out.println("The treasure chest now has " 
				+ this.gameBoard.getCurrentRoom().getTreasure().getMoneyRemaining()
				+ " unit(s) remaining");
		System.out.println("The player now has "
				+ this.gameBoard.getPlayer().getMoneyRemaining()
				+ " unit(s) remaining");
	}
}
