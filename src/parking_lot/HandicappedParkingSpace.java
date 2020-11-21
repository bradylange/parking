package parking_lot;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: HandicappedParkingSpace
 * Language: Java
 * Date: 10/18/17
 * Description: This class contains handicapped parking space attributes and algorithms to display its identity.
 */

// This class contains handicapped parking space properties and is a parking space
public class HandicappedParkingSpace extends ParkingSpace 
{
// ------------------- Default Constructor -------------------
	// Default Constructor
	public HandicappedParkingSpace()
	{
		// Instantiate default properties
		super();																// Instantiate parent (ParkingSpace) class properties 
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor
	public HandicappedParkingSpace(int space)
	{
		// Instantiate properties with parameter values 
		super(space);															// Instantiate parent (ParkingSpace) class properties 
	}
// ------------------- End Alternate Constructor Method -------------------
	
// ------------------- Show Space Type Method -------------------
	// Overrides parent method - Abstract method 
	// This method displays the type of parking space it is
	@Override
	public void showSpaceType()
	{
		System.out.println(" -- Handicapped Parking Space");
	}
// ------------------- End Show Space Type Method -------------------
} // End of class HandicappedParkingSpace
