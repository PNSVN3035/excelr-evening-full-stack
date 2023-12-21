class A 
{
	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
		this();
		System.out.println("A(int)");
	}
}

class B extends A
{
	B()
	{
		super(10);
		System.out.println("B()");
	}

	B(int i)
	{
		this();
		System.out.println("B(int)");
	}
}

class C extends B
{
	C()
	{
		this(10);
		System.out.println("C()");
	}

	C(int i)
	{
		super(i);
		System.out.println("C(int)");
	}
}

class U extends C
{
	U()
	{
		this(90);
		System.out.println("U()");
	}

	U(int i)
	{
		super(200);
		System.out.println("U(int)");
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------");
		B b1 = new B();
		System.out.println("------------");
		C c1 = new C();
		System.out.println("------------");
		U u1 = new U();
		System.out.println("------------");

		A a2 = new A(10);
		System.out.println("------------");
		B b2 = new B(20);
		System.out.println("------------");
		C c2 = new C(30);
		System.out.println("------------");
		U u2 = new U(40);
		System.out.println("------------");
	}
}
