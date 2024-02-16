class O 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("hellotoall");
		System.out.println(sb);          // 0123456789
		//sb.delete(20, 30);
		//sb.delete(4, 2);
		//sb.delete(-4, 2);
		sb.delete(2, -4);
		System.out.println(sb);
	}
}
