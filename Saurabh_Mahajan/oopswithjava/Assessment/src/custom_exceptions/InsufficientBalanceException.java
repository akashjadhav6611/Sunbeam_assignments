package custom_exceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String errmsg)
	{
		super(errmsg);
	}

}
