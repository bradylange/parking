package parking_lot;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: ParkingLot
 * Language: Java
 * Date: 10/18/17
 * Description: This class contains parking lot attributes and algorithms to modify the attributes.
 */

// This class has attributes related to a parking lot
public class ParkingLot 
{
	// Instance variables
	private ParkingSpace [] pSpace; 														// Many types of parking space using polymorphism (regular, handicapped)
	private int parkingSpaceNum; 															// Parking space number starts at 1000
// ------------------- Default Constructor -------------------
	// Default Constructor
	public ParkingLot()
	{
		// Instantiate default properties 
		parkingSpaceNum = 1000;																// This parking lot's number starts at 1000
		pSpace = new ParkingSpace[5];														// Collection of types of parking spaces 
		
		// These commands are not needed if the second option is used in getParkingLotInfo() method
		pSpace[0] = new HandicappedParkingSpace(parkingSpaceNum++);
		pSpace[1] = new HandicappedParkingSpace(parkingSpaceNum++);
		pSpace[2] = new RegularParkingSpace(parkingSpaceNum++);
		pSpace[3] = new RegularParkingSpace(parkingSpaceNum++);
		pSpace[4] = new RegularParkingSpace(parkingSpaceNum++);
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Get Parking Lot Information -------------------
	// Method that displays information about the parking lot such as each space's number 
	public void getParkingLotInfo()
	{
		// Iterate through the parking spaces using polymorphism to get the correct space type
		for (int i = 0; i < pSpace.length; i++)
		{
			System.out.print("Parking space " + pSpace[i].getSpaceNumber());
			pSpace[i].showSpaceType();														// Show parking lot's space type 
		}
		
		/* -- ANOTHER WAY TO WRITE THIS METHOD (USING POLYMORPHISM): --
		for (int i = 0; i < pSpace.length; i++)												// Iterate through each parking space
		{
			if (i >= 0 && i < 2)															// Parking space's 0 to 2 index's
			{
				pSpace[i] = new HandicappedParkingSpace(parkingSpaceNum);					// Instantiate handicapped parking space with polymorphism 
				System.out.print("Parking space " + pSpace[i].getSpaceNum());				// Show parking lot's space type 
				pSpace[i].showSpaceType();
				parkingSpaceNum++; 															// Since the parking lot numbers go up by one can we just use post increment
			}
			if (i > 1  && i < pSpace.length)												// Parking space's 2 to the length of the parking space's index's
			{
				pSpace[i] = new RegularParkingSpace(parkingSpaceNum);						// Instantiate regular parking space with polymorphism 
				System.out.print("Parking space " + pSpace[i].getSpaceNum());
				pSpace[i].showSpaceType();													// Show parking lot's space type 
				parkingSpaceNum++; 															// Since the parking lot numbers go up by one can we just use post increment
			}
			if (i < 0 || i > pSpace.length)													// Invalid index's
			{
				System.out.println("An error has occurred in your default constructor.");
			}
		} 
	  */
	} 
// ------------------- End Get Parking Lot Information -------------------
	
// ------------------- Get Number of Spaces Method -------------------
	// Method that returns the number of parking spaces 
	public int getNumOfSpaces()
	{
		return pSpace.length; 																// Return the parking lot's number of parking spaces
	} 
// ------------------- End Get Number of Spaces Method -------------------
} // End of class ParkingLot 
