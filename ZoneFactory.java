/* Project:  Project 3
 * Class: ZoneFactory.java
 * Author: Navdeep Kaur
 * Date: April 16, 2021
 * This class creates the correct zone based on the zone id that you pass to its createZone method.
 */ 

public class ZoneFactory {
	
	// ---------------------------------------------------------------- 
	// This is the method which takes the zoneid and returns the correct zone
	public Zone createZone(String zoneid) {
		
		if (zoneid == "USMountain") {
		return new ZoneUSMountain();
		}
		
		if(zoneid == "USEastern") {
		return new ZoneUSEastern();
		}
		
		if(zoneid == "USCentral") {
		return new ZoneUSCentral();
		}
		
		else {
		return new ZoneUSPacific();
		}
		
		
	}
		}



	

