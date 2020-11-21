package parking_lot;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: ParkingSpace
 * Language: Java
 * Date: 10/18/17
 * Description: This abstract class contains parking space related attributes and algorithms to modify the attributes. 
 */

// This abstract class contains parking space attributes 
abstract public class ParkingSpace 
{
	// Instance variables
	private int spaceNum;  												// Parking space number (Identification)
	private boolean isEmpty;											// If the parking space is empty or not 
// ------------------- Default Constructor -------------------
	// Default Constructor 
	public ParkingSpace()
	{
		// Instantiate default properties
		this.spaceNum = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Space Number 
	public ParkingSpace(int spaceNum)
	{
		// Instantiate properties with parameter values 
		this.spaceNum = spaceNum;
	}
// ------------------- End Alternate Constructor -------------------

// ------------------- Get Space Number Method -------------------
	// Method that returns the parking space number 
	public int getSpaceNumber() 
	{
		return spaceNum;												// Return the parking space's space number 
	}
// ------------------- End Get Space Number Method -------------------

// ------------------- Set Empty Method -------------------
	// Method that alters if the parking space is empty 
	public void setEmpty(boolean isEmpty) 
	{
		this.isEmpty = isEmpty;											// Alter the parking space's vacancy status 
	}
// ------------------- End Set Empty Method -------------------
	
// ------------------- Is Empty Method -------------------
	// Method that returns if the parking space is empty
	public boolean isEmpty() 
	{
		return isEmpty;													// Return the parking space's vacancy status
	}
// ------------------- End Is Empty Method -------------------

// ------------------- Show Space Type Method -------------------
	// This method must be used in each class to determine the parking space type
	// This method displays the type of parking space it is
	abstract public void showSpaceType();
// ------------------- End Show Space Type Method -------------------
} // End of abstract class ParkingSpace

