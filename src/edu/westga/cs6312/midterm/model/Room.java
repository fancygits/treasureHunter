package edu.westga.cs6312.midterm.model;

import java.util.Random;

/**
 * Defines a Room, an individual room inside the game
 * @author James Luke Johnson
 * @version 2018.02.15
 */
public class Room {
	private TreasureChest treasureChest;
	private int roomID;
	private Random diceRoll;
	
	/**
	 * Constructs a new Room object
	 * @param roomID	The int ID of the room
	 * @param diceRoll	A Random number
	 */
	public Room(int roomID, Random diceRoll) {
		this.roomID = roomID;
		this.diceRoll = diceRoll;
		this.setupRoom();
	}
	
	/**
	 * Helper method to setup the Room, creating a treasure
	 * chest if the diceRoll is greater than 0.5
	 */
	private void setupRoom() {
		if (this.diceRoll.nextBoolean()) {
			this.treasureChest = this.createTreasure();
		}
	}
	
	/**
	 * Helper method to create a new treasure chest object
	 * There is a 50% chance of it being a SimpleTreasure
	 * @return	A treasure chest
	 */
	private TreasureChest createTreasure() {
		TreasureChest chest;
		if (this.diceRoll.nextBoolean()) {
			chest = new RandomTreasure(this.diceRoll);
		} else {
			chest = new SimpleTreasure();
		}
		return chest;
	}
	
	/**
	 * Accessor for the roomID as a String
	 * @return	A String of the room identifying number
	 */
	public String getLocation() {
		return "Room at [" + this.roomID + "]";
	}
	
	/**
	 * Accessor for the room's treasure chest
	 * @return	The treasure chest in the current room
	 */
	public TreasureChest getTreasure() {
		return this.treasureChest;
	}
	
	/**
	 * Return a string description of the Room and its contents
	 * @return	A string description of the Room
	 */
	@Override
	public String toString() {
		String treasure = "";
		if (this.getTreasure() == null) {
			treasure = "no treasure";
		} else {
			treasure = this.getTreasure().toString();
		}
		return "Room at position " + this.roomID + " with " + treasure;
	}
}
