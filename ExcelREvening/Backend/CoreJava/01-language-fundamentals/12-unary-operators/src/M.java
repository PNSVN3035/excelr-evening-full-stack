class M 
{
	public static void main(String[] args) 
	{
		int i = 0;
		//       1  +  2  +  3  + 3 
		int j = ++i + ++i + ++i + i;
		System.out.println(i); //output is 3
		System.out.println(j); //output is 9
	}
}
// i = 1, 2, 3, 3