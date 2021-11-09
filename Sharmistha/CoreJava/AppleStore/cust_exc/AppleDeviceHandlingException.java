package cust_exc;

@SuppressWarnings("serial")
public class AppleDeviceHandlingException extends Exception{ // custom exceptions me mostly Exception se hi extend hote hai

	public AppleDeviceHandlingException(String errMesg) {
	
		super(errMesg);
	}

}
