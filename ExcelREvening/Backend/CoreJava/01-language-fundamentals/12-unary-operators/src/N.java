class N
{
	public static void main(String[] args) 
	{
		int i = 0;
		//       1  + 1 +  2  + 2
		int j = ++i + i + ++i + i;
		i = 0;
		//      -1  +-1 + -2  + -2
		int k = --i + i + --i + i;
		System.out.println(i); // -2
		System.out.println(j); // 6
		System.out.println(k); // -6
	}
}
