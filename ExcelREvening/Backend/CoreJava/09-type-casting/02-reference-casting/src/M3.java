class M3 
{
	public static void test1(A obj) //same type of reference is accepting [both are compatible]
	{
		System.out.println("test1(A)");
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		test1(a1);  //same type of reference we are passing
		System.out.println("done");
	}
}
