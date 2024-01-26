class P
{
	void test()
	{
		try
		{
			clone();
		}
		catch (CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
	}
}
