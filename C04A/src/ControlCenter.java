/**
 *	ControlCenter class
 *	Used as part of CO4A
 * 	Does not follow class coding standards?
 * 
 *	@author Mark Baldwin
 *	@author Cyndi Rader
**/

import java.util.ArrayList;

/**
 *	Creates and tests PublicSafety classes
**/
public class ControlCenter {
	private ArrayList<PublicSafety> publicSafetyOffices;
	
	/**
	 *	Constructor, sets up array list of public safety offices
	**/
	public ControlCenter() {
		publicSafetyOffices = new ArrayList<PublicSafety>();
	}

	/**
	 *	Create offices to test.
	 * 
	 *	In a real system we would prompt for office names. To simplify
	 *	grading and testing, we will hard code names and the sequence 
	 *	of hires in the following methods
	**/
	public void createOffices() {
		publicSafetyOffices.add(new PublicSafety("CSM", "Golden"));
		publicSafetyOffices.add(new PublicSafety("CU", "Boulder"));
	}
	
	/**
	 *	Hire from several stations to show the effect on badge number
	**/
	public void doHiring() {
		PublicSafety publicSafetyOffice1 = publicSafetyOffices.get(0);
		PublicSafety publicSafetyOffice2 = publicSafetyOffices.get(1);

		/**
		 *	Using an enumerated type would be better - we'll learn that soon 
		 *	For now, the PublicSafety class should have a doHire method. 
		 *  The parameter to doHire is a boolean. 
		 *  - If true, tell the city station to hire one detective. 
		 *  - If false, tell the university station to hire one detective.
		**/
		
		publicSafetyOffice1.doHire(true);
		publicSafetyOffice1.doHire(false);
		publicSafetyOffice1.doHire(true);
		publicSafetyOffice2.doHire(false);
		publicSafetyOffice2.doHire(true);
		publicSafetyOffice1.doHire(true);
		
		// Now we do a loop to show that stations ensure they don't hire more
		// than the max # of detectives. See figure 1 in assignment writeup.
		for (int i=4; i<=6; i++) {
			publicSafetyOffice1.doHire(true);
		}
	}
	
	/**
	 *	Print the results of test
	**/
	public void printAllDetectives() {
		System.out.println("\nPrinting All Detectives");
		for (PublicSafety office : publicSafetyOffices) {
			office.printDetectiveLists();
		}
	}

	/** 
	 *	Main driver for testing
	 *	@param args Input arguments for main (unused)
	**/
	public static void main(String[] args) {
		ControlCenter controlCenter = new ControlCenter(); 
		controlCenter.createOffices();
		controlCenter.doHiring();
		controlCenter.printAllDetectives();
	}
}
