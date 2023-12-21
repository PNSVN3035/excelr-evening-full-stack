class O 
{
	O()
	{
		System.out.println("O()");
	}
}

class P extends O 
{
	P()
	{
		System.out.println("P()");
	}
}

class Q extends P 
{
	Q()
	{
		System.out.println("Q()");
	}
}

class R extends Q 
{
	R()
	{
		System.out.println("R()");
	}
}

class S extends R 
{
	S()
	{
		System.out.println("S()");
	}

	public static void main(String[] args) 
	{
		O o1 = new O();
		System.out.println("---------");
		P p1 = new P();
		System.out.println("---------");
		Q q1 = new Q();
		System.out.println("---------");
		R r1 = new R();
		System.out.println("---------");
		S s1 = new S();
		System.out.println("---------");
	}
}
