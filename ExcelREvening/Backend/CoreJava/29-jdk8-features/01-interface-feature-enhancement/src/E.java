//interface doesnt have to depend on any other classes for the abstract method implementations.
//because it have its own method implementations using static and default methods.
interface E
{
	//these static methods are not inherited to the sub-class
	static void test1()
	{
		System.out.println("test1()");
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
	//void test5();
}
class F implements E
{
	public static void main(String[] args) 
	{
		E.test1();
		E.test2();
	
		F obj = new F();
		obj.test3();
		obj.test4();

		//these static methods are not inherited to the sub-class
		//obj.test1();
		//obj.test2();
		System.out.println("done");
	}
}
