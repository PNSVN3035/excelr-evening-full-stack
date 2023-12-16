class B
{
	public static void main(String[] args) 
	{
		int[] array = {10, 20, 30, 40};
		
		for (int i: array)
		{
			if (i == 20)
			{
				break;
			}
			System.out.println(i); 
		}
		
	}
}
