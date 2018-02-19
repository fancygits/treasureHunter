package edu.westga.cs6312.midterm.testing.room;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.midterm.model.Room;

/**
 * Tests the getLocation method of the Room class
 * @author James Luke Johnson
 * @version 2018.02.16
 */
class TestRoomGetLocation {

	/**
	 * Test to confirm that a new room constructed with a roomID of 1
	 * will return the correct String using getLocation (Room at [1])
	 */
	@Test
	void testGetLocationForNewRoomID1ReturnsRoomAt1() {
		Room room1 = new Room(1, new java.util.Random());
		assertEquals("Room at [1]", room1.getLocation());
	}
	
	/**
	 * Test to confirm that a new room constructed with a roomID of 99
	 * will return the correct String using getLocation (Room at [99])
	 */
	@Test
	void testGetLocationForNewRoomID99ReturnsRoomAt99() {
		Room room99 = new Room(99, new java.util.Random());
		assertEquals("Room at [99]", room99.getLocation());
	}
	
	/**
	 * Test to confirm that a new room constructed with a roomID of -5
	 * will return the correct String using getLocation (Room at [-5])
	 * 
	 * I've decided that I will allow negative rooms since it wasn't
	 * prohibited in the directions and negative rooms could be secret
	 * rooms or bonus missions
	 */
	@Test
	void testGetLocationForNewRoomIDNegative5ReturnsRoomAtNegative5() {
		Room secretRoom = new Room(-5, new java.util.Random());
		assertEquals("Room at [-5]", secretRoom.getLocation());
	}
	

}
