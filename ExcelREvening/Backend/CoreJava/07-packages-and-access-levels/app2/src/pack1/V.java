package pack1;
class U
{
	private U()
	{
		System.out.println("U()");
	}

	U(int i)
	{
		System.out.println("U(int)");
	}
}
class V extends U
{
	V()
	{
		super(10);
	}
}
