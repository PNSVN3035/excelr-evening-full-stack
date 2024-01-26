class M12 
{
	public static void main(String[] args) 
	{
		Ancestor ancestor = new GrandFather();
		GrandFather grandFather = ancestor;
		System.out.println("done");
	}
}
