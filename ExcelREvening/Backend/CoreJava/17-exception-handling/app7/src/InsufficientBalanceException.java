class InsufficientBalanceException extends ArithmeticException //extends Exception //extends ArithmeticException//extends Throwable//extends IOException
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
