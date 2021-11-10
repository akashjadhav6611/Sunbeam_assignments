package custom_exception;

@SuppressWarnings("serial")
public class StudentHandlingException extends Exception{
	
	public StudentHandlingException(String errmsg)
	{
		super(errmsg);
	}
}
