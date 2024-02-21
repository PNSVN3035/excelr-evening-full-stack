@FunctionalInterface
interface C
{
	void test1();

	static void test11()
	{
		System.out.println("test11()");
	}

	static void test2()
	{
		System.out.println("test2()");
	}

	default void test3()
	{
		System.out.println("test3()");
	}

	default void test4()
	{
		System.out.println("test4()");
	}
}

/*
- functional interfaces were introduced in java JDK 1.8. 
- A functional interface is an interface that contains only one abstract method. but it can have any number of default and static methods.
*/