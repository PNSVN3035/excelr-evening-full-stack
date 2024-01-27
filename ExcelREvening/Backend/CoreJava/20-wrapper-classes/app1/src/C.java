class C
{
	public static void main(String[] args) 
	{
		Double obj = new Double(10);//explicit-boxing
		double k = obj.doubleValue();//explicit-unboxing
		System.out.println(k);
		System.out.println("done");
	}
}