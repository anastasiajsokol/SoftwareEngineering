/**
 *  Station class
 * 
 *  @author Gray Willits
 *  @author Anastasia Sokol
 * 
 *  @date January 21, 2025
 **/

import java.util.*;

public class Station {
    /**
     *  shared between all stations
     *      - assign badge numbers in order
     *      - the first badge number should be one
    **/
    private static int nextAvailableBadgeNumber = 1;

    /**
     *  each station can have at most 5 detectives
     *  detectives must be stored in a regular array
    **/
    private static final int MAX_DETECTIVES_PER_STATION = 5;
    private Detective[] detectives = new Detective[MAX_DETECTIVES_PER_STATION];
    private int hired_detectives = 0;

    private String stationName;
    
    private static Scanner s = new Scanner(System.in);

    /**
     *  Constructor creates a station with the given name
     * 
     * @param stationName given name of station
    **/
    public Station(String stationName){
        this.stationName = stationName;
    }

    /**
     *  Prints all detectives working at station
    **/
    public void printDetectiveLists(){
    	System.out.println("List of detectives for " + stationName);
    	for (Detective d : detectives) {
    		System.out.println(d.toString());
    	}
    }
    
    public void doHire() {
    	if (hired_detectives < MAX_DETECTIVES_PER_STATION) {
    		System.out.print("New Hire for " + stationName + "...Enter detective's name: ");
    		detectives[hired_detectives] = new Detective(s.nextLine(), nextAvailableBadgeNumber);
    		nextAvailableBadgeNumber++;
    		hired_detectives++;
    	}
    	else {
    		System.out.println("Can't hire any more detectives for " + stationName);
    	}
    }
}
