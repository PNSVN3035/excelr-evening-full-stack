class O
{
	public static void main(String[] args) 
	{
		int i, j;
		for(i = 0, j = 20; (i < 5 || j>15); i++, j--)
		{
			System.out.println(i + ":" + j);
		}
		System.out.println("main end: " + i + ":" + j);

	}
}