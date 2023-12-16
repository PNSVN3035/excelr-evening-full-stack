class H
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("main begin: " + i);
			if(i >= 2)
			{
				System.out.println("skipping to next iteration: " + i);
				continue;
			}
			System.out.println("main middle: " + i);
			if(i >= 3)
			{
				System.out.println("skipping to next iteration: " + i);
				continue;
			}
			System.out.println("main end: " + i);
			System.out.println("moving to next iteration: " + i);
		}
	}
}