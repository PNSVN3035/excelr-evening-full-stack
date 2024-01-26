class K
{
	public static void main(String[] args) 
	{
		int i = 10 / 0;
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
		System.out.println("main end");
	}
}
