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
	
	public TreasureTUI(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
		this.input = new Scanner(System.in);
	}
	
	public void run() {
		System.out.println("Welcome to the Treasure Hunter Application");
		this.menu();
	}
	
	/**
	 * Helper method with the menu choices
	 */
	private void menuOptions() {
		System.out.println();
		System.out.println("1 - Describe the room");
		System.out.println("2 - Describe the player");
		System.out.println("3 - Describe the game board");
		System.out.println("9 - Quit");
	}
	
	private void menuChoices(int choice) {
		switch (choice) {
			case 1: this.describeRoom();
					break;
			case 2: this.describePlayer();
					break;
			case 3: this.describeGameBoard();
					break;
			case 9: System.out.println("\nThanks for looking for treasure with us. Goodbye!");
					System.exit(0); 
					break;
			default:System.out.println("\nThat's not a valid option. Please try again.");
		}
	}
	
	/**
	 * Helper method to run a method based on the menu choice
	 */
	private void menu() {
		int choice = 0;
		do {
			this.menuOptions();
			choice = this.getUserInt("Please enter your choice: ");
			this.menuChoices(choice);
		} while (choice != 9);
	}
	
	private int getUserInt(String message) {
		System.out.print(message);
		return Integer.parseInt(this.input.nextLine());
	}
	
	private void describeRoom() {
		System.out.println(this.gameBoard.getCurrentRoom().toString());
	}
	
	private void describePlayer() {
		System.out.println(this.gameBoard.getPlayer().toString());
	}
	
	private void describeGameBoard() {
		System.out.println(this.gameBoard.toString());
	}
}
