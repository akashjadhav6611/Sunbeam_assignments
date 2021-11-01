package utils;

import static com.app.vehicle.Vehicle.sdf;

import java.text.ParseException;
import java.util.Date;

import com.app.vehicle.Vehicle;

import custom_exception.VehicleHandlingException;

public class ValidationRules {

	private static Date strtDate;
	private static Date endDate;
	static {
		try {
			strtDate = sdf.parse("2021-4-1");
			endDate = sdf.parse("2022-3-31");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in static block:" + e);
		}

	}

	public static Date parseAndValidateManufactureDate(String manuDate)
			throws ParseException, VehicleHandlingException {
		Date d1 = sdf.parse(manuDate);

		if (d1.before(strtDate) || d1.after(endDate)) {
			throw new VehicleHandlingException("Invalid Manufacture Date");
		}
		return d1;
	}

	public static String checkForDuplicate(String chasisNo, Vehicle[] showroom) throws VehicleHandlingException {
		Vehicle newVehicle=new Vehicle(chasisNo);
		for (Vehicle v : showroom) {
			if (v != null) {
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Duplicate Chasis Number");
			}
		}

		return chasisNo;
	}
}
