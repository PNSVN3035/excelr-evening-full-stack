class X
{
	X() 
	{
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
class Z2 extends X
{
	Z2()
	{
		super();
	}
}
