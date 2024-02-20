class H	
{
	class B
	{
	}
	static class C
	{
	}
}

class Manager
{
	public static void main(String[] args) 
	{
		H.B b1 = new H().new B();
		H.C c1 = new H.C();
		System.out.println("done");
	}
}
