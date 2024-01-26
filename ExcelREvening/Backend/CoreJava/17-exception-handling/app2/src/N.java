class N
{
	public static void main(String[] args) 
	{
		/*int i = 10;
		if (i == 10)
		{
			return;  //immediately will call main method.
		}*/
		System.out.println("main begin");
		try
		{
			System.out.println("from try begin");
			System.out.println("from try end");
			return;
		}
		catch (NumberFormatException ex)
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
