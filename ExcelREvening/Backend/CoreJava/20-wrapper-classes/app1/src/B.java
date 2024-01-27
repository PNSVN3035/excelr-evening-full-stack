class B
{
	public static void main(String[] args) 
	{
		Byte obj = new Byte((byte)10);//explicit-boxing
		int k = obj.byteValue();//explicit-unboxing
		System.out.println(k);
		System.out.println("done");
	}
}