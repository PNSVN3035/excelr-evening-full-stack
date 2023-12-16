class W 
{
	int i;
	int j;

	static void test(W obj1, W obj2)
	{
		int temp1 = obj1.i;
		obj1.i = obj2.i;
		obj2.i = temp1;

		int temp2 = obj1.j;
		obj1.j = obj2.j;
		obj2.j = temp2;
	}

	public static void main(String[] args) 
	{
		W w1 = new W(), w2 = new W();
		w1.i = 10;
		w1.j = 20;
		w2.i = 30;
		w2.j = 40;
		System.out.println("before calling test(W,W): " + w1.i + ", " + w1.j);
		System.out.println("before calling test(W,W): " + w2.i + ", " + w2.j);
		test(w1,w2);
		System.out.println("after calling test(W,W): " + w1.i + ", " + w1.j);
		System.out.println("after calling test(W,W): " + w2.i + ", " + w2.j);
	}
}
