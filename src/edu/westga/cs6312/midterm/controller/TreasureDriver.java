package edu.westga.cs6312.midterm.controller;

import edu.westga.cs6312.midterm.model.GameBoard;
import edu.westga.cs6312.midterm.view.TreasureTUI;

/**
 * Defines the controller for the TreasureTUI class
 * @author James Luke Johnson
 * @version 2018.02.16
 */
public class TreasureDriver {

	/**
	 * This method is the entry point of the application
	 * 
	 * @param args Command-line arguments, not used 
	 */
	public static void main(String[] args) {
		TreasureTUI treasureHunter = new TreasureTUI(new GameBoard());
		treasureHunter.run();
	}

}
