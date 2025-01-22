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
        for(int i = 0; i < hired_detectives; ++i){
            System.out.println(detectives[i]);
        }
    }
    
    public void doHire() {
    	if (hired_detectives < MAX_DETECTIVES_PER_STATION) {
    		Scanner s = new Scanner(System.in);
    		detectives[hired_detectives] = new Detective(s.nextLine(), nextAvailableBadgeNumber);
    		nextAvailableBadgeNumber++;
    		hired_detectives++;
    		s.close();
    	}    	
    }
}
