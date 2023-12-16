class C
{
	public static void main(String[] args) 
	{
		outer:
		for(int i = 0; i < 2; i++)
		{
			System.out.println("loop1 begin: " + i);
			inner:
			for(int j = 0; i < 5; j++)
			{
				System.out.println("loop2 begin: " + j);
				if (j > 2)
				{
					continue outer;
				}
				System.out.println("loop2 end: " + j);
			}
			System.out.println("loop1 end: " + i);
		}
		System.out.println("main end");
	}
}
