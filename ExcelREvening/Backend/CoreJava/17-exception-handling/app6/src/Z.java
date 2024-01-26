class X
{
	X() throws ClassNotFoundException
	{
	}
}
class Z extends X
{
	Z() 
	{
		try
		{
			super();
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
