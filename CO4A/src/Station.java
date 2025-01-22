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
        // print header
        System.out.println("List of detectives for " + stationName);

        // print each detective
        for(int i = 0; i < hired_detectives; ++i){
            System.out.println(detectives[i]);
        }

        // ending newline
        System.out.println();
    }
    
    public void doHire() {
        // check if we can hire a new detective
        if(hired_detectives == MAX_DETECTIVES_PER_STATION){
            System.out.println("Can't hire any more detectives for " + stationName);
            return;
        }

        // display prompt
        System.out.print("New hire for " + stationName + "...Enter detective's name: ");

        // create detective from user input
        Scanner input = new Scanner(System.in);
        detectives[hired_detectives] = new Detective(input.nextLine(), nextAvailableBadgeNumber);
        
        // update the badge number and number of hired detectives
        nextAvailableBadgeNumber++;
        hired_detectives++;

        // note: do not close the scanner, which will close System.in
    }
}
