class A 
{
	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
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
		System.out.println("B(int)");
	}
}

class C extends B
{
	C()
	{
		super(10);
		System.out.println("C()");
	}

	C(int i)
	{
		super(i);
		System.out.println("C(int)");
	}
}

class T extends C
{
	T()
	{
		super(100);
		System.out.println("T()");
	}

	T(int i)
	{
		super(200);
		System.out.println("T(int)");
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------");
		B b1 = new B();
		System.out.println("------------");
		C c1 = new C();
		System.out.println("------------");
		T t1 = new T();
		System.out.println("------------");

		A a2 = new A(10);
		System.out.println("------------");
		B b2 = new B(20);
		System.out.println("------------");
		C c2 = new C(30);
		System.out.println("------------");
		T t2 = new T(40);
		System.out.println("------------");
	}
}
