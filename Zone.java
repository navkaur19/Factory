/* Project:  Project 3
 * Class: Zone.java
 * Author: Navdeep Kaur
 * Date: April 16, 2021
 * This class creates the display name and offset for the time zones. 
 */ 

 public class Zone {
	private String displayName;
	private int offset;
	
	// ---------------------------------------------------------------- 
	// This is a constructor containing variables displayName and offset
	public Zone(String displayName, int offset) {
		this.displayName = displayName;
		this.offset = offset;
	}
	
	// ---------------------------------------------------------------- 
	// This is a getter for displayName
	public String getDisplayName() {
		return displayName;
	}
	
	// ---------------------------------------------------------------- 
	// This is a getter for offset
	public int getOffset() {
		return offset;
	}
}
