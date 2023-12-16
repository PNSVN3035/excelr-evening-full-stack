class D 
{
	static int counter;

	D()
	{
		counter++;
	}

	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("A-----------A: " + obj1.counter);
		D obj2 = new D();
		System.out.println("B-----------B: " + obj2.counter);
		D obj3 = new D();
		System.out.println("C-----------C: " + obj3.counter);
		D obj4 = new D();
		System.out.println("D-----------D: " + obj4.counter);
		D obj5 = new D();
		System.out.println("E-----------E: " + obj5.counter);
		System.out.println("------------------------------");
		System.out.println("Final ------- Final: " + obj1.counter);
		System.out.println("Final ------- Final: " + obj2.counter);
		System.out.println("Final ------- Final: " + obj3.counter);
		System.out.println("Final ------- Final: " + obj4.counter);
		System.out.println("Final ------- Final: " + obj5.counter);
	}
}
