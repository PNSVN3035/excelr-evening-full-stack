class A 
{
	static
	{
		System.out.println("A-SIB");
	}

	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
		this();
		System.out.println("A(int)");
	}

	{
		System.out.println("A-IIB");
	}
}

class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}

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

	{
		System.out.println("B-IIB");
	}
}

class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}

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

	{
		System.out.println("C-IIB");
	}
}

class V extends C
{
	static
	{
		System.out.println("V-SIB");
	}

	V()
	{
		this(90);
		System.out.println("V()");
	}

	V(int i)
	{
		super(200);
		System.out.println("V(int)");
	}

	{
		System.out.println("V-IIB");
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------");
		B b1 = new B();
		System.out.println("------------");
		C c1 = new C();
		System.out.println("------------");
		V v1 = new V();
		System.out.println("------------");

		A a2 = new A(10);
		System.out.println("------------");
		B b2 = new B(20);
		System.out.println("------------");
		C c2 = new C(30);
		System.out.println("------------");
		V v2 = new V(40);
		System.out.println("------------");
	}
}
