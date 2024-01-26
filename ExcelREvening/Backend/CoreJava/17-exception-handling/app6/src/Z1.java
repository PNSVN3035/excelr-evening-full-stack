class X
{
	X() throws ClassNotFoundException
	{
		Class.forName("");
	}
}
class Z1 extends X
{
	Z1() throws ClassNotFoundException
	{
		super();
	}
}
