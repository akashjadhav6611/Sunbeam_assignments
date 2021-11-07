package custom_exceptions;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception
{
	public AccountNotFoundException(String errmsg)
	{
		super(errmsg);
	}

}
