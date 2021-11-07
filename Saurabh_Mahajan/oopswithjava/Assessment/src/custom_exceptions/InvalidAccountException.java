package custom_exceptions;

@SuppressWarnings("serial")
public class InvalidAccountException extends Exception
{
	public InvalidAccountException(String errmsg)
	{
		super(errmsg);
	}

}
