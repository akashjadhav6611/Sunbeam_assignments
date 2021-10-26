package com.utils;

import com.app.vehicles.Vehicle;
import com.exceptions.InvalidChasisException;

public class ChasisNumberUtils {
	// in future compare chasisNumber with arrays
	public static int validateChasisNumber(int chasisNumber, Vehicle[] showroom) throws InvalidChasisException {
		boolean chassisNumberFound = false;
		for(Vehicle v : showroom) {
			if (v != null) {
				if(chasisNumber == v.getChasisNo()) {
					chassisNumberFound = true;
				}
			}
		}
		
		if(chassisNumberFound == true) {
			throw new InvalidChasisException("The chasis number " + chasisNumber + " may be a duplicate.");
		}
		return chasisNumber;
	}
}

/*
public class ChasisNumberUtils {
	// in future compare chasisNumber with arrays
	public static void validateChasisNumber(int chasisNumber, Vehicle ch) throws InvalidChasisException {
		if (ch.getChasisNo() != chasisNumber) {
			throw new InvalidChasisException("The chasis number " + chasisNumber + " may be a duplicate.");
		}
	}
}
 */
