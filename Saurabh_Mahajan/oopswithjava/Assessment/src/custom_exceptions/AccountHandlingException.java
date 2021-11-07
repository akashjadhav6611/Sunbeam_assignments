package custom_exceptions;

@SuppressWarnings("serial")
public class AccountHandlingException extends Exception
{
	public AccountHandlingException(String errmsg)
	{
		super(errmsg);
	}

}
