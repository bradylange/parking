package parking_lot_application;

import parking_lot.ParkingLot;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: ParkingAppliction
 * Language: Java
 * Date: 10/18/17
 * Description: This program tests the functionality of the parking lot classes. The program displays a parking space and what type of space it is
 * using polymorphism.
 */

// This program tests the functionality of the parking lot
public class ParkingApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program
	public static void main(String [] args) 
	{
		System.out.println("***************************************** Parking Lot: *******************************************");
		// Instantiate parking lot info
		ParkingLot langeLot = new ParkingLot();
		 
		// Print out parking lot info
		langeLot.getParkingLotInfo();
		 
		// Print out number of parking spaces 
		int numOfSpaces = langeLot.getNumOfSpaces();
		System.out.println("\n" + numOfSpaces + " parking spaces");
		System.out.println("*********************************************************************************************\n");
	}
// ------------------- End Main Method -------------------
} // End of class ParkingApplication