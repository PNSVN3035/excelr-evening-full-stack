class E 
{
	int i;

	E(int i) //constructor with loading argument int i
	{
		this.i = i;
		System.out.println("E(int)");
	}

	public static void main(String[] args) 
	{
		E e1 = new E(10);
		System.out.println("done: " + e1.i);
	}
}
