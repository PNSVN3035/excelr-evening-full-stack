class M18
{
	public static void main(String[] args) 
	{
		Ancestor ancestor = new Father();
		System.out.println(11);
		GrandFather grandFather = (GrandFather)ancestor;
		System.out.println(22);
		Father father = (Father)ancestor;
		System.out.println(33);
		Son son = (Son)ancestor;
		System.out.println(44);
	}
}
