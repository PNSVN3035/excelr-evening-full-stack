class T
{
	static int i = 10;

	static
	{
		j = i;
	}
	
	static int j = 20;

	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
