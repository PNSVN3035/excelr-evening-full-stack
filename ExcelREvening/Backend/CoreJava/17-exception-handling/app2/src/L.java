class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("from try");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch: " + ex);
		}
		finally
		{
			System.out.println("from finally");	
		}
		int i = 10 / 0;
		System.out.println("main end");
	}
}
