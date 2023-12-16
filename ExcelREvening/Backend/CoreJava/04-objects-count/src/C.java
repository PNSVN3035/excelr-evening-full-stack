class C 
{
	int counter;

	C()
	{
		counter++;
	}

	public static void main(String[] args) 
	{
		C obj1 = new C();
		System.out.println("A-----------A: " + obj1.counter);
		C obj2 = new C();
		System.out.println("B-----------B: " + obj2.counter);
		C obj3 = new C();
		System.out.println("C-----------C: " + obj3.counter);
		C obj4 = new C();
		System.out.println("D-----------D: " + obj4.counter);
		C obj5 = new C();
		System.out.println("E-----------E: " + obj5.counter);
	}
}
