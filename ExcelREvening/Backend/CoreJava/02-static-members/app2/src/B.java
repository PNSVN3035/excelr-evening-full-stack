class B
{

	static int test()
	{
		return i;
	}

	static int i = 10; 
	static int j = test(); 

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
