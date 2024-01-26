class L2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		try
		{
			int i = 10 / 0; //AE
		}
		catch (ArithmeticException ex1)
		{
			try
			{
				int j = Integer.parseInt("abc"); //NFE
			}
			catch (NumberFormatException ex2)
			{
				try
				{
					String s1 = null;
					int k = s1.length(); //NPE
				}
				catch (NullPointerException ex3)
				{
					try
					{
						int[] l = new int[4];
						int m = l[4]; //AIOBE
					}
					catch (ArrayIndexOutOfBoundsException ex4)
					{
						try
						{
							Object obj = new L();
							String s = (String)obj; //CCE
						}
						catch (ClassCastException ex5)
						{
							try
							{
								main(null); //SOE
							}
							catch (StackOverflowError ex6)
							{
								try
								{
									int[] n = new int[99999999]; //OME
								}
								catch (OutOfMemoryError ex7)
								{
									try
									{
										String s2 = "hello";
										String s3 = s2.substring(5, 10); //SIOBE
									}
									catch (StringIndexOutOfBoundsException ex8)
									{
										try
										{
											int[] p = new int[-10]; //NASE
										}
										catch (NegativeArraySizeException ex9)
										{
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("main end");
	}
}
