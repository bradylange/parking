package parking_lot;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: RegularParkingSpace
 * Language: Java
 * Date: 10/18/17
 * Description: This class contains regular parking space attributes and algorithms to display its identity.
 */

// This class contains regular parking space attributes and is a parking space
public class RegularParkingSpace extends ParkingSpace 
{
// ------------------- Default Constructor -------------------
	// Default Constructor
	public RegularParkingSpace() 
	{
		// Instantiate default properties 
		super();																		// Instantiate parent (ParkingSpace) class properties
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Space Number 
	public RegularParkingSpace(int spaceNum)
	{
		// Instantiate properties with parameter values
		super(spaceNum);																// Instantiate parent (ParkingSpace) class properties
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Show Space Type Method -------------------
	// Overrides the parent class - Abstract method
	// This method displays the type of parking space it is
	@Override
	public void showSpaceType()
	{
		System.out.println(" -- Regular Parking Space");
	}
// ------------------- End Show Space Type Method -------------------
} // End of class RegularParkingSpace
