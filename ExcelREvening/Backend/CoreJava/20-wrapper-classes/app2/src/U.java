//import java.util.Arrays;
public class U
{
	static void test(String...str)
	{
		System.out.println(str.length);

		for (String element :  str)
		{
			System.out.println("var args-for-each: " + element);
		}

		System.out.println("--------------");

		for(int i = 0; i < str.length; i++)
		{
			System.out.println("var args-for: " + str[i]);
		}
	}
	/*
	U(String...args)
	{
		String[] array = new String[args.length];
		for(int i = 0; i < args.length; i++)
		{
			if(i < args.length)
			{
				array[i] = args[i];
			}
		}
		System.out.println(Arrays.toString(array));
	}*/
	public static void main(String [] args)
	{
		test();
		test("abc");
		test("msg1", "xyz", "hello");
		/*
		U u1 = new U();
		U u2 = new U("abc");
		U u3 = new U("msg1", "xyz", "hello");
		U u4 = new U("msg1", "xyz", "hello","abc");*/
	}
}
