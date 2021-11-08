package custom_exceptions;

@SuppressWarnings("serial")
public class SingerHandlingException extends Exception
{
	public SingerHandlingException(String errmsg)
	{
		super(errmsg);
	}
}
