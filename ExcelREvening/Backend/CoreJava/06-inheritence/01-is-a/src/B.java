class A //super class
{
	int i;
}

class B extends A //sub class
{
	int j;

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
