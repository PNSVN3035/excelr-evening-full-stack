class M17
{
	public static void main(String[] args) 
	{
		Ancestor ancestor1 = new GrandFather();
		GrandFather grandFather1 = (GrandFather)ancestor1;
		System.out.println("--------");
		Ancestor ancestor2 = new Ancestor();
		GrandFather grandFather2 = (GrandFather)ancestor2;
		System.out.println("--------");
	}
}
