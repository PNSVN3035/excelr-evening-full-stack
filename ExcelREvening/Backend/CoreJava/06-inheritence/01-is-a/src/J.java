class G
{
	static void test1()
	{
		System.out.println("from class G.test1()");
	}
}

class H extends G 
{
	static void test2()
	{
		System.out.println("from class H.test2()");
	}
}

class I extends H
{
	static void test3()
	{
		System.out.println("from class I.test3()");
	}
}

class J extends I
{
	static void test4()
	{
		System.out.println("from class J.test4()");
	}

	public static void main(String[] args) 
	{
		J.test1();
		J.test2();
		J.test3();
		J.test4();
		System.out.println("done");
	}
}
