class M
{
	M()
	{
		System.out.println("M()");
	}
}

class N extends M
{
	N()
	{
		System.out.println("N()");
	}
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("from N main");
	}
}

/*
- There is class called Object that is the in-built class.
*/