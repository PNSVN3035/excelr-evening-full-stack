class V 
{
	int i;
	static V test(V obj)
	{
		System.out.println("from V(V) begin: " + obj.i);
		V v1 = new V();
		v1.i = obj.i; 
		System.out.println("from V(V) end: " + v1.i);
		return v1;
	}

	public static void main(String[] args) 
	{
		V ref = new V();
		ref.i = 10;
		System.out.println("from main begin: " + ref.i);
		V v2 = test(ref);
		System.out.println("from main end: " + v2.i);
	}
}
