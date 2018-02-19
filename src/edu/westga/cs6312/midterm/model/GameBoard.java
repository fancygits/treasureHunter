package edu.westga.cs6312.midterm.model;

import java.util.Random;

/**
 * Defines the GameBoard class to keep track of
 * the state of our game and objects
 * @author James Luke Johnson
 * @version 2018.02.16
 */
public class GameBoard {
	private Room[] rooms;
	private Random diceRoll;
	private Player player;
	private int currentRoomID;
	
	/**
	 * Constructs a new GameBoard object
	 */
	public GameBoard() {
		this.diceRoll = new Random();
		this.setupBoard();
	}
	
	/**
	 * Sets up the GameBoard by creating a new player
	 * adding 10 new rooms to the board and starting
	 * in room 0.
	 */
	private void setupBoard() {
		this.player = new Player();
		this.rooms = new Room[10];
		for (int count = 0; count < this.rooms.length; count++) {
			this.rooms[count] = new Room(count, this.diceRoll);
		}
		this.currentRoomID = 0;
	}
	
	/**
	 * Accessor to the player on the GameBoard
	 * @return	The player
	 */
	public Player getPlayer() {
		return this.player;
	}
	
	/**
	 * Accessor to the room the player is currently in
	 * @return	The current room of the player
	 */
	public Room getCurrentRoom() {
		return this.rooms[this.currentRoomID];
	}
	
	/**
	 * Returns a description of the game board and its contents
	 * @return	A String description of the object
	 */
	@Override
	public String toString() {
		String description = "";
		for (Room current: this.rooms) {
			description += current.toString() + "\n";
		}
		description += "\n" + this.getPlayer().toString();
		description += "\nand is located in " + this.getCurrentRoom().toString();
		return description;
	}
	
	/**
	 * Moves the player to the next room on the right
	 */
	public void moveRight() {
		if (this.currentRoomID == (this.rooms.length - 1)) {
			this.currentRoomID = 0;
		} else {
			this.currentRoomID += 1;
		}
	}
	
	/**
	 * Moves the player to the next room on the left
	 */
	public void moveLeft() {
		if (this.currentRoomID == 0) {
			this.currentRoomID = (this.rooms.length - 1);
		} else {
			this.currentRoomID -= 1;
		}
	}
}
