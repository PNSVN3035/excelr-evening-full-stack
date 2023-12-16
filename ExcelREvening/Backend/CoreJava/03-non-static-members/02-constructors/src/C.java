class C
{
	C()
	{
		System.out.println("C()");
	}
	public static void main(String[] args) 
	{
		C c1 = new C(); 
		C c2 = new C();
		System.out.println("done");
	}
}
