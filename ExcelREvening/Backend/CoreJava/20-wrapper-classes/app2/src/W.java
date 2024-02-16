public class W
{
	static void test(String...varArg)
	{ 
		/*
		//by default var-arg is an array
		//iterating an array by using for-each loop
		if (varArg.length == 0)
		{
			System.out.println("No elements");
		}
		else
		{
			for(String s1 : varArg)
			{
				if(varArg.length == 1)
				{
					System.out.println(s1);
				}
				else if(varArg.length > 1)
				{
					if(varArg.length != varArg.length - 1)
					{
						System.out.print(s1 + ", ");
						if (varArg.length - 1 == varArg.length - 1)
						{
							System.out.print(s1);
						}
					}
				}
			}
		}
	}
	*/
	if (varArg.length == 0)
	{
		System.out.print("No elements");
	}
	int counter = 0;

	for(String s1 : varArg)
	{
		counter++;

		System.out.print(s1);

		if(counter < varArg.length)
		{
			System.out.print(",");
		}
	}
	/*
	if ((varArg.length == 0))
	{
		System.out.println();
	}*/
	System.out.println();
	
}

	public static void main(String [] args)
	{
		test();
		test("abc");
		test("hello","test");
		test("hello","test","xyz");
		test("hello","test","xyz","abc");
	}
}
