class M
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
			try
			{
				int i = 10 / 0;
			}
			catch (ArithmeticException ex)
			{
			}
			finally
			{
				System.out.println("from nested-finally");	
			}
		}
		System.out.println("main end");
	}
}
