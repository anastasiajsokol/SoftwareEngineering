
/**
 *  PublicSafety class
 *  
 *  @author Anastasia Sokol
 *  @author Gray Willits
 * 
 *  @date January 21, 2025
**/

import java.util.Arrays;

public class PublicSafety {
	private Station cityStation;
	private Station univerityStation;

	/**
	 * Constructor accepts the names of two stations
	 * 
	 * @param cityStationName       name of the city station
	 * @param universityStationName name of the university station
	 **/
	public PublicSafety(String cityStationName, String universityStationName) {
		cityStation = new Station(cityStationName);
		univerityStation = new Station(universityStationName);
	}

	/**
	 * Prints all detectives working at public safety office
	 **/
	public void printDetectiveLists() {
		// for both stations
		for (Station station : Arrays.asList(cityStation, univerityStation)) {
			// print the stations list of detectives
			station.printDetectiveLists();
		}
	}

	/**
	 * Calls doHire() on one the Stations
	 * 
	 * @param bool		true to hire for the city, false to hire for the university
	 **/
	public void doHire(boolean bool) {
		if (bool) {
			cityStation.doHire();
		} else {
			univerityStation.doHire();
		}
	}
}