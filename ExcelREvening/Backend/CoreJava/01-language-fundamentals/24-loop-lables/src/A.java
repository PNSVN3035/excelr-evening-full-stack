class A 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 2; i++)
		{
			System.out.println("loop1 begin: " + i);
			for(int j = 0; i < 5; j++)
			{
				System.out.println("loop2 begin: " + j);
				if (j > 2)
				{
					continue;
				}
				System.out.println("loop2 end: " + j);
			}
			System.out.println("loop1 end: " + i);
		}
		System.out.println("main end");
	}
}
